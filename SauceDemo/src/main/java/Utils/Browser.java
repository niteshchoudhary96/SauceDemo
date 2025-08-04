package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Browser extends File_Reader {
	public WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications", "--disable-popup-blocking");
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");  
		driver = new ChromeDriver(options);
			driver.get(websitedetails.getProperty("URL"));
	}
	
	
	
	
	//@AfterTest
	public void CloseBrowser() {
		
		String Title = driver.getTitle();
		System.out.println("page title :"+Title);
		if(Title.contains("Swag Labs")) {
		driver.quit();
		
		}
	}

}
