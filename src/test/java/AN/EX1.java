package AN;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.Loginpage;
import pageObject.ManagerPage;
import pageObject.accountsPage;
import pageObject.disbursePage;
import pageObject.frames;
import pageObject.newClaim;
import pageObject.new_TravelReq;

public class EX1 extends base
  
{   
    @Test    
	public void ClaimPage() throws Throwable
	  {     
		  
		driver= initializedriver();            
	    driver.get("http://demo.pomfret.entosstech.com:8080/actnow/menu/actnow.xhtml");
	    Loginpage l=new Loginpage(driver);
	   	l.getusername().sendKeys("employee");       
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
	   a.accounts_Action_verified();
	   t.getsubmit().click(); 
	   t.submitPopup();
	   f.defaultframe();  
	   l.getLogout_icon();  
	   l.getLogout().click();  
	   Thread.sleep(3000);
	   System.out.println("Finished by accounts");
	     
	   //MANAGER(APPROVE)
	   
	   l.getusername().sendKeys("amanager");   
	   l.getpassword();  
	   l.getsubmit();           
	   f.SwitchtoFrame();
	   ManagerPage m=new ManagerPage(driver);
	   a.My_task();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   f.switchtoframe(0);
	   m.manager_Action_approve();
	   t.getsubmit().click(); 
	   t.submitPopup();  
	   f.defaultframe();  
	   l.getLogout_icon();  
	   l.getLogout().click();  
	   Thread.sleep(3000); 
	   System.out.println("Finished by Manager");
	   
	   // Disburse
	   
	   l.getusername().sendKeys("disburse");    
	   l.getpassword();  
	   l.getsubmit();           
	   f.SwitchtoFrame();
	   disbursePage od=new disbursePage(driver);
	   od.D_group_Task();
	   od.D_My_task(); 
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   f.switchtoframe(0);
	   od.PaymentType();
	   od.disburse_Action_complete();     
	   od.disburse_submit();    
	   t.submitPopup();   
	   f.defaultframe();    
	   l.getLogout_icon();  
	   l.getLogout().click();     
	   System.out.println("Finished");
	  }
}
