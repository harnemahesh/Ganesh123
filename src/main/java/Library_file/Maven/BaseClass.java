package Library_file.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass 
{
  public WebDriver driver;
	public void Initializebrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan\\eclipse-workspace\\MAHESH_JAVA_SELENIUM_MAVEN_TestNG\\Maven\\Browser\\chromedriver.exe");
	
	    driver=new ChromeDriver();
	   
	   driver.get("https://www.amazon.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	}
	
	
	
}
