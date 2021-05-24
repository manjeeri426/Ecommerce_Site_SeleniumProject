package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_info {

	WebDriver ldriver;
	public Edit_info(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	@FindBy(xpath="//*[@id='content']/ul[1]/li[1]/a")
	public WebElement edit_info;
	
	@FindBy(id="input-firstname")
	public WebElement firstname;
	

	@FindBy(id="input-lastname" )
	public WebElement lastname;
	
	@FindBy(id="input-email" )
	public WebElement email;		
			
	
	@FindBy(id="input-telephone")
	public WebElement telephone;
	

	@FindBy(xpath="//input[@value='Continue']" )
	public WebElement continue_button;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible'] " )
	public WebElement alert_messege;
	
	
	
	
	

			
}
