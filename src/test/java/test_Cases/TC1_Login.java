package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_Objects.Dashboard;
import page_Objects.Edit_info;
import page_Objects.Log_out;
import page_Objects.Login;

public class TC1_Login extends Base_Class {

	String messege;

	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		Login l=new Login(driver);
		
		l.loginlink.click();
		Thread.sleep(3000);
		l.email.sendKeys(username);
		Thread.sleep(2000);
		l.password.sendKeys(password);
		Thread.sleep(3000);
		l.login.click();
		Thread.sleep(3000);
	}
	
	@Test
	public void dashboard() throws InterruptedException
	{
		Dashboard d=new Dashboard(driver);
		d.phones.click();
		
		WebElement product=d.product1;
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)");
		Thread.sleep(4000);
		//jse.executeScript("arguments[0].scrollIntoView();",product);
		
		d.product1.click();
		
		jse.executeScript("window.scrollBy(0,550)");
		
		d.product2.click();
		
		jse.executeScript("window.scrollBy(0,550)");
		
		d.product3.click();
		
		Thread.sleep(4000);
	    d.cart_total.click();
		d.view_cart.click();
		
		Thread.sleep(4000);
		
		//d.checkout.click();
		
		d.my_Account.click();
		Thread.sleep(3000);
		d.my_Account_dropdown.click();
		Thread.sleep(2000);
	
	
		Edit_info f=new Edit_info(driver);
		
		Thread.sleep(4000);
		f.edit_info.click();
		Thread.sleep(3000);
		f.telephone.clear();
		f.telephone.sendKeys("5667676777");
		Thread.sleep(3000);
		f.continue_button.click();
		Thread.sleep(6000);
		
	   messege=f.alert_messege.getText();
	   System.out.print("edited information successfull"+ messege);
	  
	  Assert.assertEquals(messege, "Success: Your account has been successfully updated.");
	
	  Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,550)");
	
	Log_out o= new Log_out(driver);
		Thread.sleep(8000);
		o.log_out.click();
		
	
	}	
}
