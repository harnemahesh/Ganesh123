package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{

	@FindBy(xpath="//a[@id='nav-hamburger-menu']")  private WebElement All;
	@FindBy(xpath="//div[text()='Electronics']")  private WebElement Electronics;
	@FindBy(xpath="//a[text()='Headphones']")      private WebElement headphone;
	
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void AllBtn()
	{
		All.click();
	}
	public void Electronics()
	{
		Electronics.click();
	}
	public void headphone()
	{
		headphone.click();
	}
}
