package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class frames
{
	public  WebDriver driver;
	public JavascriptExecutor executor;
	
	public frames(WebDriver driver) 
	{ 
		this.driver=driver; 
		 this.executor = (JavascriptExecutor) this.driver;
		 PageFactory.initElements(driver, this); 
	}
	
	public void switchtoframe(int index)
	{
      driver.switchTo().frame(index);
   }
	
	public void SwitchtoFrame()
	{
		driver.switchTo().frame("fram");
	}

	public void defaultframe()
	{
      driver.switchTo().defaultContent();
   }

public void countframes()
{ 
	List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
	System.out.println(totalframe.size());
	
	
	}
}



