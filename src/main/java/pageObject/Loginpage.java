package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Loginpage {
	
	public WebDriver driver;
   
	
	By username=By.id("j_username");
	By password=By.id("j_password");
	By submit=By.name("j_idt6");
	By logout_Icon=By.xpath("//img[@src='images/profile.png']");
	By logout=By.xpath("//a[contains(text(),'Logout')]");
	
	public Loginpage(WebDriver driver) 
	{ 
		this.driver=driver;  
	}

	public WebElement getusername()
	{
	 return driver.findElement(username);
	}
    
	public void getpassword()
	{
		driver.findElement(password).sendKeys("demo");
	}
	
	public void getsubmit()
	{
		 driver.findElement(submit).click();
	}
	


	
	public void getLogout_icon()
	{
		 Actions action=new Actions(driver);
	    WebElement log=driver.findElement(logout_Icon); 
		action.moveToElement(log).perform();
	}
   
	public WebElement getLogout()
	{
		return driver.findElement(logout);
	}
	
	
}


