package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AN.base;

public class ManagerPage extends base
{
	public WebDriver driver;
	
	By group_task=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/ul[1]/li[2]/a[1]");
    By my_Task=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/ul[1]/li[1]/a[1]");
    By myTask_Record=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]");
    By A_action=By.name("action");
    
    
	
	public ManagerPage(WebDriver driver) 
	{ 
		this.driver=driver;  
	}
	
	public void manager_Action_approve() 
	{
		Select accounts_action=new Select(driver.findElement(A_action));
	 accounts_action.selectByVisibleText("Approve");
		 }
	
	public void manager_Action_sendBack()
	{
		Select accounts_action=new Select(driver.findElement(A_action));
	 accounts_action.selectByVisibleText("Send Back To Employee");
		 } 
	public void manager_Action_furtherApprove()
	{
		Select accounts_action=new Select(driver.findElement(A_action));
	 accounts_action.selectByVisibleText("Need Further Approval");
		 } 
	public void manager_Action_Reject()
	{
		Select accounts_action=new Select(driver.findElement(A_action));
	 accounts_action.selectByVisibleText("Reject");
		 } 
	
}
