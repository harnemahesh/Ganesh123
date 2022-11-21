package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 
{

	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[7]") private WebElement Jbl;
	@FindBy(xpath="//a[text()=' Add to List ']")  private WebElement Add_to_List;
	@FindBy(xpath="(//div[@class='a-column a-span12'])[2]") private WebElement Add_Account;
	
	public Pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void jbl()
	{
		Jbl.click();
	}
	public void Add()
	{
		Add_to_List.click();
	}
	
	public void AddAccount()
	{
		Add_Account.click();
	}
	
	
	
}
