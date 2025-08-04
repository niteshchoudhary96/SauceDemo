package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkout_Complete extends Checkout_Overview {
	
	
	
	@Test(priority = 6)
	public void Confirmtext() {
		
	
				
		
	WebElement text =	driver.findElement(By.xpath(pagelocaters.getProperty("TAG_TEXT")));	
	String pagetext =	text.getText();
	
	
	if(pagetext.contains("Thank you for your order!")){
		
		System.out.println("Text showing and matching");
		driver.findElement(By.xpath(pagelocaters.getProperty("BACK_TO_HOME"))).click();
	}
	else {
		
		System.out.println("Text not showing and matching");
	}
	
			
				
		
		
		
	}

}
