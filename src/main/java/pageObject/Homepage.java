package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	public JavascriptExecutor executor;
	
	
	By my_taskIcon=By.xpath("//img[@src='images/mytask.png']");
	By my_task=By.xpath("//li[@title='All the tasks assigned to you']");
	By my_requestIcon=By.xpath("//img[@src='images/airplane.png']");
	By travel_request=By.id("process");
	By my_claimIcon=By.xpath("//img[@src='images/airplane.png']");
	By travel_claim=By.xpath("//li[@title='You can reimburse the money through this use case']");
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	
	public Homepage(WebDriver driver)     
	{ 
		this.driver=driver; 
		this.executor = (JavascriptExecutor) this.driver;
		 PageFactory.initElements(driver, this); 
		 
			
	} 

	public WebElement getmy_task()
	{
		return (WebElement) executor.executeScript("arguments[0].click();", my_taskIcon);
		
	}
    
	public void gettravel_request() throws InterruptedException 
	{
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		WebElement ele = driver.findElement(my_requestIcon);
		action.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(travel_request);
		action.moveToElement(ele1).perform();
		executor.executeScript("arguments[0].click();", ele1);
		
	
	}
	
	public void gettravel_claim() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		WebElement elee = driver.findElement(my_claimIcon);
		action.moveToElement(elee).perform();
		WebElement ele2 = driver.findElement(travel_claim);
		action.moveToElement(ele2).perform();
		executor.executeScript("arguments[0].click();", ele2);
	}
}
