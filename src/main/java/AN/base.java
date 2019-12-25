package AN;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
     WebDriver driver; 
	
  public WebDriver initializedriver() throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\TEM\\src\\main\\java\\AN\\data.properties");
	    prop.load(fis);
	    String browserName= prop.getProperty("browser");
	   
	    if(browserName.equals("chrome"))  
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	driver= new ChromeDriver();
	    }
	    else if(browserName.equals("fire fox"))
	    {
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    	driver= new FirefoxDriver();
	    }
	    else if(browserName.equals("IE"))  
	    {
	    	
	    }
	    
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      return driver;
	      
	}
  public void sleep() throws Throwable
  {
   Thread.sleep(3000);
  } 
}
