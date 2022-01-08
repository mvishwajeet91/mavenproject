package model1LogInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogINPage2 {

	///declaring page variables with accesss level private
		@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
		@FindBy(xpath="//button[text()='Continue ']") private WebElement CONTBTN;
		
		
		//Initializing variables in constructor with access level public
		
	public LogINPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

		//Utilization of variables with access level public

	public void enterpin(String pinvalue)
	{
		PIN.sendKeys(pinvalue);
	}
	public void clkcont()
	{
		CONTBTN.click();
	}

}
