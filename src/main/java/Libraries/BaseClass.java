package Libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
protected WebDriver driver;
	
	//Author==@VishwjeePatil
	//This method is used to initialize browser
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","");
		driver = new ChromeDriver();
				
		//Open the page
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
