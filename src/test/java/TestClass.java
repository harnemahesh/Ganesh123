
import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_file.Maven.BaseClass;
import Library_file.Maven.UtilityClass;
import Module1.Pom1;
import Module1.Pom2;
import Module1.Pom3;

public class TestClass extends BaseClass 
{
	Pom1 P1;
	Pom2 P2;
	Pom3 P3;
	@BeforeClass
	public void OpenBrowser()
	{
		Initializebrowser();
		 P1=new Pom1(driver);
		 P2=new Pom2(driver);
	     P3=new Pom3(driver);
	}
	
	@BeforeMethod
	public void Login() throws IOException, InterruptedException
	{
		
			
	}
	
	@Test
	public void TC1() throws InterruptedException, IOException
	{
		P1.AllBtn();
		Thread.sleep(2000);
		P1.Electronics();
		Thread.sleep(2000);
		P1.headphone();
		Thread.sleep(2000);
		
		P2.jbl();
		Thread.sleep(2000);
		P2.Add();
		Thread.sleep(2000);
		//P2.AddAccount();
		
		
		
		P3.Email(UtilityClass.Credential("Email"));
		Thread.sleep(2000);
		P3.Continued();
	     String	Actual=P3.Error();
	     System.out.println(Actual);
	     
	    String ExpectedResult=UtilityClass.Excelsheet(0, 0);
	    Assert.assertEquals(Actual, ExpectedResult);
	}
	
	@AfterMethod
	public void LogOut()
	{
		
	}
	
    @AfterClass
    public void ClosedBrowser()
    {
    	driver.close();
   
    }


}
