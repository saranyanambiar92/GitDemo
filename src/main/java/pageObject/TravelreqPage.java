package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelreqPage {
	
	public WebDriver driver;
	public JavascriptExecutor executor;
	public Actions action =new Actions(driver); 
	
	By my_task=By.xpath("//li[@title='All the tasks assigned to you']");
	By image_travel=By.xpath("//img[@src='images/airplane.png']");
	By travel_request=By.xpath("//li[@title='You can disburse amount before travelling through this use case']");
	
	By travel_claim=By.xpath("//li[@title='You can reimburse the money through this use case']");
	
	public TravelreqPage(WebDriver driver) 
	{ 
		this.driver=driver; 
		 this.executor = (JavascriptExecutor) this.driver;
		 PageFactory.initElements(driver, this); 
	}

	public WebElement getmy_task()
	{
		return (WebElement) executor.executeScript("arguments[0].click();", my_task);
	}
    
	public void gettravel_request() 
	{
	WebElement ele = driver.findElement(By.xpath("//img[@src='images/airplane.png']"));
	action.moveToElement(ele).perform();
	WebElement ele2 = driver.findElement(By.xpath("//li[contains(text(),'Travel Request')]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", ele2);
	// return (WebElement) executor.executeScript("arguments[0].click();", travel_request);
	}
	
	public WebElement gettravel_claim()
	{
		return (WebElement) executor.executeScript("arguments[0].click();", travel_claim);
	}
}
