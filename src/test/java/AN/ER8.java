package AN;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pageObject.Homepage;
import pageObject.Loginpage;
import pageObject.ManagerPage;
import pageObject.accountsPage;
import pageObject.claim_EmployeeReview;
import pageObject.disbursePage;
import pageObject.doc_notes_history_Page;
import pageObject.employeeReview;
import pageObject.frames;
import pageObject.newClaim;
import pageObject.new_TravelReq;

public class ER8 extends base   
{   
    
	@Test    
	public void navigationPage() throws Throwable
	  {     
		  
		driver= initializedriver();              
	    driver.get("http://demo.pomfret.entosstech.com:8080/actnow/menu/actnow.xhtml");
	    Loginpage l=new Loginpage(driver);    
	   	l.getusername().sendKeys("parthiban");       
		l.getpassword(); 
		l.getsubmit();              
		Homepage h=new Homepage(driver);      
		new_TravelReq t=new new_TravelReq(driver);
	    h.gettravel_claim();       
	    frames f=new frames(driver);    
	    f.switchtoframe(0);
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	   f.switchtoframe(0);
	   newClaim c=new  newClaim(driver);  
	   c.requestId();
	   c.tBookedBy();   
	   c.tAmount();
	   c.hotelCheck();
	   c.hBookedBy();
	   c.hAmount(); 
	   c.localCheck();
	   c.from();
	   c.to(); 
	   c.mode();
	   c.lAmount();
	   c.currency();  
	   
	   //notes
	   
	  doc_notes_history_Page d=new doc_notes_history_Page(driver); 
	   d.get_notes().click();
	   d.get_description().sendKeys("proceed as soon as possible sir");  
	   d.get_remarks().sendKeys("as it is a urgent plan, please approve my travel request");
	   d.get_save().click();    
	   sleep(); 
	   
	   //main 
	   
	   sleep();   
	   d.get_mains().click(); 
	   c.C_submit();    
	   c.subPopup();
	   f.defaultframe();   
	   l.getLogout_icon();  
	  l.getLogout().click();  
	  Thread.sleep(3000);         
	   
	   //ACCOUNTS(verifier)
	  
	   l.getusername().sendKeys("thomas");   
	   l.getpassword();  
	   l.getsubmit();       
	   f.SwitchtoFrame();
	   accountsPage a=new accountsPage(driver);
	   a.group_Task();   
	   a.My_task();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   f.switchtoframe(0);
	   a.accounts_Action_sendBack();
	   t.getsubmit().click();   
	   t.submitPopup();
	   f.defaultframe();  
	   l.getLogout_icon();   
	   l.getLogout().click();  
	   Thread.sleep(3000);
	   
	   //Send Back to employee
	   
	   l.getusername().sendKeys("parthiban");   
	   l.getpassword();   
	   l.getsubmit();                
	   f.SwitchtoFrame();
	   a.My_task();    
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   f.switchtoframe(0);
	   claim_EmployeeReview ce=new claim_EmployeeReview(driver);
	   employeeReview r=new employeeReview(driver);
	   ce.Emp_ActionCancel();    
	   ce.C_submit();  
	   ce.subPopup();
	   f.defaultframe();       
	   l.getLogout_icon();    
	   l.getLogout().click();  
	   Thread.sleep(3000);
	   
	    }    
	}  
	
    

