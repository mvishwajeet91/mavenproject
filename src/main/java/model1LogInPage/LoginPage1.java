package model1LogInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//Declaring the data members/Variables with access level private
	
		@FindBy(xpath="//input[@id='userid']") private WebElement UN;
		@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
		@FindBy(xpath="//button[@type='submit']") private WebElement loginbtn;
		
		//Inititialize variables in constructor with access level public
		
public LoginPage1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//utilizing variables with access level public
		
	public void enterUN(String username)
	{
		UN.sendKeys(username);
	}
	public void enterPWD(String password)
	{
		PWD.sendKeys(password);
	}
		
	public void clkloginbtn()
	{
		loginbtn.click();
	}
	
	}



	//method name convenstion
	//input:= set+name of pomclass+Elementname



