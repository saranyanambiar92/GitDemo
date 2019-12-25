package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import AN.base;

public class accountsPage extends base
{
	public WebDriver driver;
	
	By group_task=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/ul[1]/li[2]/a[1]");
    By my_Task=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/ul[1]/li[1]/a[1]");
    By myTask_Record=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]");
    By A_action=By.name("action");
                                
                                
	
    
	public accountsPage(WebDriver driver) 
	{ 
		this.driver=driver;  
	}

	public void group_Task() throws Throwable
	{
		sleep();
	 driver.findElement(group_task).click();
	  sleep();
	  int i = 12;
	  boolean c = (i >= 12);                     
	  if(true);  
    { 
	 Select s1=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr['i+']/td[6]/select[1]")));
     s1.selectByVisibleText("Assign");
	  }
	}
    
	public void My_task() throws Throwable
	{  
		sleep();     
		//driver.findElement(my_Task).click();
		sleep();
		driver.findElement(myTask_Record).click();
	} 
	
	public void accounts_Action_verified() 
	{
		Select accounts_action=new Select(driver.findElement(A_action));
	 accounts_action.selectByVisibleText("Verified");
		 }
	
	public void accounts_Action_sendBack()
	{
		Select accounts_action=new Select(driver.findElement(A_action));
	 accounts_action.selectByVisibleText("Send Back To Employee");
		 } 
	
}
