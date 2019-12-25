
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class claim_EmployeeReview 
{
	public WebDriver driver;
	public JavascriptExecutor executor;
	public WebDriverWait wait;
	
	By claimId=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[5]/input[1]");
	By claim_reqId=By.xpath("//div[@ng-show='panel0']//div[6]//input[1]");
	By startDate=By.id("startdate");
	By endDate=By.xpath("enddate");
	By view=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/section[1]/form[1]/div[1]/div[2]/div[2]/div[4]/button[1]");
	
	//Tickets
	
	By tiketCheck=By.id("ticketcheck");
	By date=By.id("dep_date");
	By modeTravel=By.name("modeOftravel");
	By classTravel=By.name("classOftravel");
	By travelFrom=By.name("travelFrom");
	By travelTo=By.name("travelTo");
	By tBookedBy=By.id("booked_by");
	By tAmount=By.name("travelamount");
	By tReceiptView=By.xpath("//div[@class='col-xs-1']//button[@type='button'][contains(text(),'View')]");
	By tChangeUplooad=By.xpath("//div[@class='col-sm-12']//div[1]//div[2]//div[2]//div[3]//button[1]");
	By tReceipt=By.xpath("//div[@class='col-xs-3 ng-scope']//input[@type='file']");
	By tSumAmount=By.xpath("sumAmountTicket");
	
	//Hotel
	
	By hotelCheck=By.xpath("//div[@class='container-fluid']//div[3]//div[1]//div[1]//label[1]//input[1]");
	By hotelName=By.name("hotel_name");
	By checkIn=By.name("checkinDate");
	By checkOut=By.name("checkoutDate");
	By hBookedBy=By.id("booked_byHotel");
	By hAmount=By.name("hotel_amount");
	By hupload=By.xpath("//div[@class='container-fluid']//div[3]//div[2]//div[2]//div[2]//button[1]");
	By hReceipt=By.xpath("//div[@ng-show='x.hotelCheck']//input[@type='file']");
	By hSumAmount=By.name("hotelSumAmount");
	
	// local Conveyences
	
	By localCheck=By.xpath("//div[5]//div[1]//div[1]//label[1]//input[1]") ;
	By Sdate=By.name("startDate");
	By from=By.name("localConveyanceFrom");
	By to=By.name("localConveyanceTo");
	By mode=By.name("localConveyanceMode");
	By lAmount=By.name("localConveyance_amount");
	By lSumAmount=By.name("sumAmountLocalConveyance");
	
	//Per diem
	
	By pCheck=By.xpath("//div[8]//div[1]//div[1]//label[1]//input[1]");
	By fromDate=By.name("fromDate");
	By toDate=By.name("toDate");
	By noDays=By.name("perDiem_days");
	By pEligible=By.name("Eligible");
	By pAmount=By.name("perDiem_amount");
	
	//Miscellaneous  
	
	By mCheck=By.xpath("//div[9]//div[1]//div[1]//label[1]//input[1]");
	By mDate=By.name("miscStartDate");
	By mDescription=By.name("description0");
	By mAmount=By.name("localConveyance_amount");
	By changeUpload=By.xpath("//div[@ng-show='panel1']//div[2]//div[1]//div[5]//button[1]");
	By mReceipt=By.xpath("//div[@ng-show='x.miscellaneousCheck']//input[@type='file']");
	By mSumAmount=By.name("miscSumAmount");
	
	By currency=By.name("currency");
	By totalAmount=By.xpath("//div[@class='container-fluid']//div[3]//div[1]//div[2]//div[1]//input[1]");
	By advance=By.xpath("//div[@class='col-xs-2 ng-scope']//input[@type='text']");
	By due=By.xpath("//div[@class='row']//div[1]//div[1]//input[1]");
	
	By emp_Action=By.name("action");
	By remarks=By.id("comment");
			
	
	
	By submit=By.id("sub");
	By cancel=By.id("close");
	By submitPopup=By.xpath("//div[@class='modal-dialog']//button[@type='button'][contains(text(),'Close')]");
	
	//methods
	
	public claim_EmployeeReview(WebDriver driver) 
	{ 
		this.driver=driver; 
		this.executor = (JavascriptExecutor) this.driver;
		 PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, 15, 50);
	}
	
	public void claimId()
	{
		driver.findElement(claimId);
	}
	
	public void requestId()
	{
		Select reqId=new Select(driver.findElement(claim_reqId));
		reqId.selectByVisibleText("1004857");
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
		driver.findElement(tAmount).sendKeys("10000");
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
	
	public void Emp_ActionResubmit()
	{
		Select act=new Select(driver.findElement(emp_Action));
	    act.selectByVisibleText("Resubmit");
	}
	
	public void Emp_ActionCancel()
	{
		Select act=new Select(driver.findElement(emp_Action));
	    act.selectByVisibleText("Cancel");
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
