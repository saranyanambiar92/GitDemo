package AN;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pageObject.Homepage;
import pageObject.Loginpage;
import pageObject.ManagerPage;
import pageObject.accountsPage;
import pageObject.disbursePage;
import pageObject.doc_notes_history_Page; 
import pageObject.frames; 
import pageObject.new_TravelReq;

public class TR4 extends base   
{   
    
	@Test    
	public void navigationPage() throws Throwable
	  {     
		   
		driver= initializedriver();            
	    driver.get("http://demo.pomfret.entosstech.com:8080/actnow/menu/actnow.xhtml");
	    Loginpage l=new Loginpage(driver);
	   	l.getusername().sendKeys("employee");       
		l.getpassword();
		l.getsubmit();     
		Homepage h=new Homepage(driver);     
		
	    h.gettravel_request();       
	    frames f=new frames(driver);    
	    f.switchtoframe(0);
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	   f.switchtoframe(0);
	   new_TravelReq t=new  new_TravelReq(driver);
	   t.getplace_visit().sendKeys("Delhi");  
	   t.getpurpose_visit();
	    t.getstart_date();         
	   t.getend_date();
	   t.getprojectName();
	   t.getdropdown_billedTo();
	   t.getticketCheck().click();
	   t.getmode_travel();
	   t.getclass_travel();
	   t.gettravelFrom().sendKeys("Bengaluru");
	   t.gettravelamount().sendKeys("2000");
	   t.gethotelCheck().click();
	   t.gethotelName().sendKeys("ITC");
	   t.gethotelAmaount().sendKeys("1000");
	   t.getlocalCheck().click();
	   t.getlocalAmaount().sendKeys("1000"); 
	   t.getperdiemChek().click();
	   t.getEligible().sendKeys("1000");
	   
	   // documents
	   doc_notes_history_Page d=new doc_notes_history_Page(driver); 
	  /* d.get_documents().click();
	   d.get_choosefile().sendKeys("C:\\Users\\Admin\\Desktop\\JPG format\\IMG_20181229_0002.jpg");
	   d.get_upload();
	   d.get_docPopup();  */        
	    
	   //notes
	   d.get_notes().click();
	   d.get_description().sendKeys("proceed as soon as poosible sir");  
	   d.get_remarks().sendKeys("as it is a urgent plan, please approve my travel request");
	   d.get_save().click();    
	   sleep(); 
	   
	   //main   
	   sleep();  
	   d.get_mains().click(); 
	   t.getsubmit().click();       
	   t.submitPopup();
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
	   
	   //MANAGER(APPROVE)
	   
	   l.getusername().sendKeys("amanager");   
	   l.getpassword();  
	   l.getsubmit();         
	   f.SwitchtoFrame();
	   ManagerPage m=new ManagerPage(driver);
	   a.My_task();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   f.switchtoframe(0);
	   m.manager_Action_furtherApprove();
	   t.getsubmit().click(); 
	   t.submitPopup();
	   f.defaultframe();  
	   l.getLogout_icon();  
	   l.getLogout().click();  
	   Thread.sleep(3000);
	   
	   //Senior Manager
	   
	   l.getusername().sendKeys("seniormanager");   
	   l.getpassword();  
	   l.getsubmit();         
	   f.SwitchtoFrame();
	 //  Sr_ManagerPage m=new Sr_ManagerPage(driver);
	   a.My_task();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   f.switchtoframe(0);
	   m.manager_Action_Reject(); 
	   t.getsubmit().click(); 
	   t.submitPopup();
	   f.defaultframe();  
	   l.getLogout_icon();  
	   l.getLogout().click();  
	   Thread.sleep(3000);
	  
	      
	    }
	}  
	
    

