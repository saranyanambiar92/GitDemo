package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AN.base;

public class disbursePage extends base
{
	public WebDriver driver; 
	
	By group_task=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/ul[1]/li[2]/a[1]");
    By my_Task=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/ul[1]/li[1]/a[1]");
    By D_myTask_Record=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]");
    By paymentType=By.xpath("//div[@class='row']//select[@name='paymentType']");
    By D_action=By.xpath("//div[@class='col-sm-2']//select[@name='actionStatus']");
    By D_submit=By.xpath("//button[@type='submit']");
    By D_cancel=By.xpath("//button[contains(text(),'Cancel')]");
  
	
    
	public disbursePage(WebDriver driver) 
	{ 
		this.driver=driver;  
	}

	public void D_group_Task() throws Throwable
	{
		sleep();
	 driver.findElement(group_task).click();
	  sleep();
	  int i = 6;
	  boolean c = (i >= 6);                     
	  if(true);                                       
    { 
	 Select s1=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr['i+']/td[6]/select[1]")));
     s1.selectByVisibleText("Assign");
	  }
	}
    
	public void D_My_task() throws Throwable
	{  
		sleep();
		//driver.findElement(my_Task).click();
		sleep();
		driver.findElement(D_myTask_Record).click();
	}
	
	public void PaymentType() throws Throwable  
	{
		Select payType=new Select(driver.findElement(paymentType));
		payType.selectByVisibleText("Cash");
		
	}
	
	public void disburse_Action_complete() 
	{
		Select accounts_action=new Select(driver.findElement(D_action));
	 accounts_action.selectByIndex(1);
		 }
	
	public void disburse_submit()
	{
		driver.findElement(D_submit).click();
	}
	
	public void disburse_cancel()
	{
		driver.findElement(D_cancel).click();
	}
	
	
	
}
