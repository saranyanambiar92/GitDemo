package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newClaim 
{
	public WebDriver driver;
	public JavascriptExecutor executor;
	public WebDriverWait wait;
	
	By requestId=By.xpath("//select[@name='travelRequestId']");
	By startDate=By.xpath("//input[@id='startdate']");
	By endDate=By.xpath("//input[@id='endDate']");
	By view=By.xpath("//button[contains(text(),'View')]");
	
	//Tickets
	
	By tiketCheck=By.xpath("//input[@id='ticketcheck']");
	By date=By.xpath("//input[@id='dep_date']");
	By modeTravel=By.xpath("//div[@class='col-sm-2']//select[@placeholder='Enter']");
	By classTravel=By.xpath("//select[@name='classOftravel0']");
	By travelFrom=By.xpath("travelFrom0");
	By travelTo=By.xpath("//input[@id='travelTo']");
	By tBookedBy=By.xpath("//select[@id='booked_by']");
	By tReceipt=By.xpath("//div[@ng-show='x.ticketCheck']//input[@type='file']");
	By tAmount=By.name("travelamount0");
	By tSumAmount=By.xpath("//div[@class='col-sm-2 travelSumAmount ng-scope']//input[@placeholder='Enter']");
	
	//Hotel
	
	By hotelCheck=By.xpath("//div[@class='container-fluid']//div[3]//div[1]//div[1]//label[1]//input[1]");
	By hotelName=By.name("hotel_name0");
	By checkIn=By.id("check_in");
	By checkOut=By.id("check_out");
	By hReceipt=By.xpath("//div[@ng-show='x.hotelCheck']//input[@type='file']");
	By hBookedBy=By.xpath("//select[@id='booked_byHotel']");
	By hAmount=By.name("hotel_amount0");
	By hSumAmount=By.name("hotelSumAmount");
	
	// local Conveyences
	
	By localCheck=By.xpath("//div[5]//div[1]//div[1]//label[1]//input[1]") ;
	By Sdate=By.xpath("//input[@id='start_dat']");
	By from=By.name("localConveyanceFrom0");
	By to=By.name("localConveyanceTo0");
	By mode=By.name("localConveyanceMode0");
	By lReceipt=By.xpath("//div[@ng-show='x.localConveyanceCheck']//input[@type='file']");
	By lAmount=By.name("localConveyance_amount0");
	By lSumAmount=By.name("sumAmountLocalConveyance");
	
	//Per diem
	
	By pCheck=By.xpath("//div[7]//div[1]//div[1]//label[1]//input[1]");
	By fromDate=By.xpath("//input[@id='fromDate']");
	By toDate=By.xpath("//input[@id='toDate']");
	By noDays=By.xpath("perDiem_days0");
	By pEligible=By.xpath("Eligible0");
	By pAmount=By.name("perDiem_amount0");
	
	//Miscellaneous  
	
	By mCheck=By.xpath("//div[8]//div[1]//div[1]//label[1]//input[1]");
	By mDate=By.id("miscStartDate");
	By mDescription=By.name("description0");
	By mReceipt=By.xpath("//div[@ng-show='x.miscellaneousCheck']//input[@type='file']");
	By mAmount=By.name("misc_amount0");
	By mSumAmount=By.name("miscSumAmount");
	
	By currency=By.name("currency");
	By totalAmount=By.xpath("//div[@class='container-fluid']//div[3]//div[1]//div[2]//div[1]//input[1]");
	By advance=By.xpath("//div[@class='row']//div[3]//div[1]//input[1]");
	
	By submit=By.id("sub");
	By cancel=By.id("close");
	By submitPopup=By.xpath("//div[@class='modal-dialog']//button[@type='button'][contains(text(),'Close')]");
	
	//methods
	
	public newClaim(WebDriver driver) 
	{ 
		this.driver=driver; 
		this.executor = (JavascriptExecutor) this.driver;
		 PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, 15, 50);
	}
	public void requestId()
	{
		Select reqId=new Select(driver.findElement(requestId));
		reqId.selectByVisibleText("1005044");
	}
	 
	public void startDate()  
	{
		driver.findElement(startDate);
	}  
	
	public void endDate()
	{
		driver.findElement(endDate);
	}
	
	public void view()
	{
	driver.findElement(view).click();  
	}
	
	public void tiketCheck()
	{
		driver.findElement(tiketCheck);
	}
	
	public void date()
	{
		driver.findElement(date);
	}
	
	public void modeTravel()
	{
		driver.findElement(modeTravel);
	}
	
	public void classTravel()
	{
		driver.findElement(classTravel);
	}
	
	public void travelFrom()
	{
		driver.findElement(travelFrom);
	}
	
	public void travelTo()
	{
		driver.findElement(travelTo);
	}
	
	public void tBookedBy() throws InterruptedException
	{
		Thread.sleep(3000);
		Select booked=new Select(driver.findElement(tBookedBy));
		booked.selectByVisibleText("Self");
	}
	
	public void tReceipt()
	{
		driver.findElement(tReceipt);
	}
	
	public void tAmount()
	{
		driver.findElement(tAmount).sendKeys("5000");
	}
	
	public void tSumAmount()
	{
		driver.findElement(tSumAmount);
	}
	
	public void hotelCheck()
	{
		driver.findElement(hotelCheck);
	}
	
	public void hotelName()
	{
		driver.findElement(hotelName);
	}
	
	public void checkIn()
	{
		driver.findElement(checkIn);
	}
	
	public void checkOut()
	{
		driver.findElement(checkOut);
	}
	
	public void hReceipt()
	{
		driver.findElement(hReceipt);
	}
	
	public void hBookedBy()
	{
		Select b=new Select(driver.findElement(hBookedBy));
		b.selectByVisibleText("Self");
	}
	
	public void hAmount()
	{
		driver.findElement(hAmount).sendKeys("5000");
	}
	
	public void hSumAmount()
	{
		driver.findElement(hSumAmount);
	}
	
	public void localCheck()
	{
		driver.findElement(localCheck);
	}
	
	public void Sdate()
	{
		driver.findElement(Sdate);
	}
	
	public void from()
	{
		driver.findElement(from).sendKeys("Majestic");
		
	}
	
	public void to()
	{
		driver.findElement(to).sendKeys("Airport");
	}
	
	public void mode()
	{
		driver.findElement(mode).sendKeys("OLA");
	}
	
	public void lReceipt()
	{
		driver.findElement(lReceipt);
	}
	
	public void lAmount()
	{
		driver.findElement(lAmount).sendKeys("1500");
	}
	
	public void lSumAmount()
	{
		driver.findElement(lSumAmount);
	}
	
	public void pCheck()
	{
		driver.findElement(pCheck);
	}
	
	public void fromDate()
	{
		driver.findElement(fromDate);
	}
	
	public void toDate()
	{
		driver.findElement(toDate);
	}
	
	public void noDays()
	{
		driver.findElement(noDays);
	}
	
	public void pEligible()
	{
		driver.findElement(pEligible);
	}
	
	public void pAmount()
	{
		driver.findElement(pAmount);
	}
	
	public void mCheck()
	{
		driver.findElement(mCheck).click();
	}
	
	public void  mDate()
	{
		driver.findElement( mDate);
	}
	
	public void mDescription()
	{
		driver.findElement(mDescription);
	}
	
	public void mReceipt()
	{
		driver.findElement(mReceipt);
	}
	
	public void mAmount()
	{
		driver.findElement(mAmount);
	}
	
	public void mSumAmount()
	{
		driver.findElement(mSumAmount);
	}
	
	public void currency()
	{
		Select cur=new Select(driver.findElement(currency));
		cur.selectByVisibleText("INR");
	}
	
	public void totalAmount()
	{
		driver.findElement(totalAmount);
	}
	
	public void advance()
	{
		driver.findElement(advance);
	}
	
	public void C_submit() throws InterruptedException
	{  
		Thread.sleep(2000);
		driver.findElement(submit).click();
	}
	
	public void C_cancel()
	{
		driver.findElement(cancel);
	}
	
	public void subPopup() throws InterruptedException
	{ 
		Thread.sleep(2000);
		driver.findElement(submitPopup).click();  
	}
	
	
	
	
	
	
	
	
	
	
	
}
