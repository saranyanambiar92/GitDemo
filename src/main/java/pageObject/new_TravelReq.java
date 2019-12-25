package pageObject;

import java.util.List;
import java.util.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class new_TravelReq {
	
	public WebDriver driver;
	public JavascriptExecutor executor;
	public WebDriverWait wait;

	
	
	By travel_id=By.xpath("//input[@id='trId']");
	By place_visit=By.xpath("//input[@id='place_visit']");
	By  dropdown_purpose_visit=By.xpath("//select[@id='purpose_visit']");
	By start_date=By.xpath("//div[@class='row']//div[4]//input[1]");
	By end_date=By.xpath("//div[@class='row']//div[5]//input[1]");
	By projectName=By.id("projectName");
	By dropdown_billedTo=By.xpath("//select[@id='billedTo']");
	By International=By.cssSelector("//label[contains(text(),'International')]//input[@placeholder='Enter']");
	
	//ticket row
	  
	By ticketCheck=By.cssSelector("#ticketCheck");
	By mode_travel=By.xpath("//div[@class='col-sm-2 mode']//select[@placeholder='Enter']");
	By class_travel=By.xpath("//select[@name='classOftravel0']");
	By travelFrom=By.xpath("//div[contains(@class,'col-sm-2 travel_from')]//input[contains(@placeholder,'Enter')]");
	By travelTo=By.cssSelector("#travelTo");
	By departureDate=By.name("departureDate0");
	By returnDate=By.name("returnDate0");
	By travelamount=By.name("travelamount0");
	By addon=By.xpath("//div[contains(@ng-show,'x.ticketCheck')]//button[contains(@type,'button')][contains(text(),'+')]");
	
	//hotel row 
	
	By hotelCheck=By.xpath("//div[contains(@class,'travelData')]//div[2]//div[1]//div[1]//label[1]//input[1]");
	By hotelName=By.xpath("//div[@ng-show='x.hotelCheck']//div[@class='col-xs-12']//div[1]//input[1]");
	By checkinDate=By.xpath("//div[contains(@ng-show,'x.hotelCheck')]//div[2]//input[1]");
	By CheckoutDate=By.xpath("//div[contains(@ng-show,'x.hotelCheck')]//div[3]//input[1]");
	By hotelAmaount=By.xpath("//div[contains(@ng-show,'x.hotelCheck')]//div[4]//input[1]");
	By hotelAddOn=By.xpath("//div[contains(@ng-show,'x.hotelCheck')]//button[contains(@type,'button')][contains(text(),'+')]");
	
	//Local conveyences
	
	By localCheck=By.xpath("//*[text()='Local Conveyance']");
	By startDate=By.name("startDate0");
	By endDate=By.xpath("endDate0");
	By localAmaount=By.name("localConveyance_amount0");
	By localAddon=By.name("//div[contains(@ng-show,'x.localConveyanceCheck')]//button[contains(@type,'button')][contains(text(),'+')]");
	
	//per diem
	
	By perdiemChek=By.xpath("//*[text()='Per Diem']");
	By fromDate=By.name("fromDate0");
	By toDate=By.name("toDate0");
	By perDiem_days=By.name("perDiem_days0");
	By Eligible=By.name("Eligible0");
	By perDiem_amount=By.name("perDiem_amount0");
	
	//currency and total
	
	By currency=By.name("currency");
	By amount=By.name("amount");

	
	//main button
	
	By close=By.id("close");
	By submit=By.id("sub"); 
	By submitPopup=By.xpath("//div[@class='modal-dialog']//button[@type='button'][contains(text(),'Close')]");
	
		//methods
	
 public new_TravelReq(WebDriver driver) 
	{ 
		this.driver=driver; 
		this.executor = (JavascriptExecutor) this.driver;
		 PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, 15, 50);
	}
 
 /*public void switch_to_frame()
 {
	 
	    Integer numberOfFrames = Integer.parseInt(executor.executeScript("return window.length").toString());
	    System.out.println("Number of iframes on the page are " + numberOfFrames);
	}*/

	public WebElement gettravel_id()
	{   
		return driver.findElement(travel_id);
	}
    
	public WebElement getplace_visit() 
	{
		return driver.findElement(place_visit);
	} 
	
	public void getpurpose_visit()  
	{
		Select drop = new Select(driver.findElement(dropdown_purpose_visit));
	      drop.selectByIndex(3);   
	}
	
	  
	
	public void getstart_date() throws InterruptedException
	{ 
		Thread.sleep(3000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(start_date));	 
	    element.click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))// month select
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();//right arrow
		}
        List<WebElement> s_dates= driver.findElements(By.className("day"));  // listing no of dates
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();// counting the size having no of days

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("25"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}
	}     
	}
	
	
	public void getend_date() throws InterruptedException
	{
		Thread.sleep(1000);
	 driver.findElement(end_date).click();
	 while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		} 
      List<WebElement> e_dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count1=driver.findElements(By.className("day")).size();

		for(int i=0;i<count1;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("27"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}
		
		}
	}
	
	public void getprojectName()
	{
		driver.findElement(projectName).sendKeys("ActNow");;
	}
	
	public void getdropdown_billedTo()
	{
		Select drop = new Select(driver.findElement(dropdown_billedTo));
	      drop.selectByIndex(1);
	}
	
	public WebElement getInternational()
	{
		return driver.findElement(International);
	}
	
	public WebElement getticketCheck()
	{
		return driver.findElement(ticketCheck);
	}
	
	public void getmode_travel()
	{
		Select drop = new Select(driver.findElement(mode_travel));
	      drop.selectByIndex(1);
	}
	
	public void getclass_travel()
	{
		Select drop = new Select(driver.findElement(class_travel));
	      drop.selectByIndex(1);
	     
	}
	
	public WebElement gettravelFrom()
	{
		return driver.findElement(travelFrom);
	}
	
	public WebElement gettravelamount()
	{
		return driver.findElement(travelamount);
	}
	
	public WebElement gethotelCheck()
	{
		return driver.findElement(hotelCheck);
	}
	
	public WebElement gethotelName()
	{
		return driver.findElement(hotelName);
	}
	
	public WebElement gethotelAmaount()
	{
		return driver.findElement(hotelAmaount);
	}
	
	public WebElement getlocalCheck()
	{
		return driver.findElement(localCheck);
	}
	
	public WebElement getlocalAmaount()
	{
		return driver.findElement(localAmaount);
	}
	
	public WebElement getperdiemChek()
	{
		return driver.findElement(perdiemChek);
	}
	
	public WebElement getEligible()
	{
		return driver.findElement(Eligible);
	}
	
	public WebElement getcurrency()
	{
		return driver.findElement(currency);
	}
	
	public WebElement getamount()
	{
		return driver.findElement(amount);
	}
	 
	public WebElement getsubmit()
	{
		return driver.findElement(submit);
	}
	
	public void submitPopup() throws InterruptedException
	{ 
		Thread.sleep(3000);
	  driver.findElement(submitPopup).click();
	}
	
	
}
