package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver ldriver;
	public Dashboard(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	@FindBy(xpath="//a[normalize-space()='Phones & PDAs']")
	public WebElement phones;
	
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[1]")
	public WebElement product1;
	
	@FindBy(xpath="//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[1]")
	public WebElement product2;
	
	
	@FindBy(xpath="//*[@id='content']/div[2]/div[3]/div/div[2]/div[2]/button[1]")
	public WebElement product3;
	

	
	@FindBy(xpath="//*[@id='cart']/button")
	public WebElement cart_total;
	

	@FindBy(xpath="//*[@id='cart']/ul/li[2]/div/p/a[1]")
	public WebElement view_cart;
	
	@FindBy(xpath="//*[@id='content']/div[3]/div[2]/a")
	public WebElement checkout;
	
	@FindBy(xpath="//a[@title='My Account']")
	public WebElement my_Account;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']")
	public WebElement my_Account_dropdown;
	
	
}
