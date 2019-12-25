package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doc_notes_history_Page {
	
	public WebDriver driver; 
	public JavascriptExecutor executor;
	
	//main tab
	By mainsTab=By.xpath("//a[contains(text(),'Main')]"); 
	  
	//Documents tab
	
	By documents=By.xpath("//a[contains(text(),'Documents')]");
	
	By choose_file=By.xpath ( "//input[@id='document']");
	
	By upload=By.xpath("//button[contains(text(),'Upload')]");
	
	By doc_popup=By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[3]/button[1]");
	
	
	//Notes tab
	
	By notes=By.xpath("/html[1]/body[1]/div[3]/ul[1]/li[3]/a[1]");
	By description=By.xpath("//textarea[@placeholder='Enter Description']");
	By remarks=By.xpath("//textarea[@placeholder='Enter Remarks']");
	By save=By.xpath("//div[@class='col-xs-offset-10']");
	
	//History tab
	
	By history=By.xpath("//a[contains(text(),'History')]");
	
	//methods
	
	public doc_notes_history_Page(WebDriver driver) 
	{ 
		this.driver=driver; 
		 this.executor = (JavascriptExecutor) this.driver;
		 PageFactory.initElements(driver, this); 
	}
	
	public WebElement get_mains()
	{
		return driver.findElement(mainsTab);
	}

	public WebElement get_documents()
	{
		return driver.findElement(documents);
	}
    
	public WebElement get_choosefile() 
	{
		return driver.findElement(choose_file);
	}
	
	public void get_upload() throws InterruptedException
	{
		driver.findElement(upload).click();
		Thread.sleep(3000);
	}
	
	public void get_docPopup() throws InterruptedException
	{
		Thread.sleep(5000);
	   driver.findElement(doc_popup).click();
	}
	
	public WebElement get_notes() throws InterruptedException
	{  
		Thread.sleep(3000);
		return driver.findElement(notes);
		
	}
	
	public WebElement get_description()
	{
		return driver.findElement(description);
	}
	
	public WebElement get_remarks()
	{
		return driver.findElement(remarks);
	}
	
	public WebElement get_save()
	{
		return driver.findElement(save);
	}
	
	public WebElement get_history()
	{
		return driver.findElement((By) history);
	}
	
	
}
