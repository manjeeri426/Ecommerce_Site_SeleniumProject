package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver ldriver;
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath="//*[@id='column-right']/div/a[1]")
	public WebElement loginlink; 
	
	
	@FindBy(id="input-email")
	public WebElement email;
	
	@FindBy(id="input-password")
	public WebElement password;
	

	@FindBy(xpath="//input[@value='Login']")
	public WebElement login;

				
			
}
