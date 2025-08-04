package Page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Checkout_information_page extends Checkout_Overview {

	@Test(priority = 4)
	public void information() {
	


		driver.findElement(By.xpath(pagelocaters.getProperty("FIRST_NAME")))
		.sendKeys(websitedetails.getProperty("First_Name"));
		
		driver.findElement(By.xpath(pagelocaters.getProperty("LAST_NAME")))
		.sendKeys(websitedetails.getProperty("Last_Name"));
		
		driver.findElement(By.xpath(pagelocaters.getProperty("ZIP_CODE")))
		.sendKeys(websitedetails.getProperty("Zip"));
		
		
		driver.findElement(By.xpath(pagelocaters.getProperty("CONTINUE_BUTTON")))
		.click();
		
		
		
	}
	
	
}
