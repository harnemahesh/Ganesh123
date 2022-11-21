package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 
{

	@FindBy(xpath="//input[@type='email']") private WebElement Email;
	@FindBy(xpath="//input[@class='a-button-input']") private WebElement Continued;
	@FindBy(xpath="//div[@class='a-box-inner a-alert-container']") private WebElement Eror;
	public Pom3(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void Email(String Username)
	{
		Email.sendKeys(Username);
	}
	public void Continued()
	{
		Continued.click();
	}
	public String Error()
	{
	String Actual=Eror.getText();
	
	
	return Actual;
	}
	
}
