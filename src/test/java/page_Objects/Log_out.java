package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_out {


	WebDriver ldriver;
	public Log_out(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	@FindBy(xpath="//*[@id='column-right']/div/a[13]")
	public WebElement log_out;
	
	
	
}
