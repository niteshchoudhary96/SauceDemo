package Page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BacktoLogin extends Checkout_Complete {
	
	
	@Test(priority = 7)
	public void GotoLoginScreen() {
		

		driver.findElement(By.xpath(pagelocaters.getProperty("HAMBURGER_BUTTON"))).click();
		
		
		driver.findElement(By.xpath(pagelocaters.getProperty("LOGOUT_BUTTON"))).click();
		
	
	}

}
