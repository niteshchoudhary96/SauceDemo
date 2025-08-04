package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Shopping_Cart_page extends Main_Items_page {
	

	@Test(priority = 3)
	public void CheckoutItemList() {
		
		WebElement ChcekRemove = driver.findElement(By.xpath(pagelocaters.getProperty("REMOVE_TO_CART_TSHIRT")));
		ExplicitWait(ChcekRemove, 10);
		
		driver.findElement(By.xpath(pagelocaters.getProperty("GOTO_CART"))).click();
		
		WebElement backpack = driver.findElement(By.xpath(pagelocaters.getProperty("BACKPACK")));
		String Bp = backpack.getText();
		WebElement Tshirt = driver.findElement(By.xpath(pagelocaters.getProperty("T_SHIRT")));
		String Ts = Tshirt.getText();
		System.out.println(Ts);

			
if(Bp.contains("Sauce Labs Backpack") )	
{
	
	driver.findElement(By.xpath(pagelocaters.getProperty("CHECKOUT_BUTTON"))).click();
	
}
else {
	
	System.out.println("Item not present here");
	
}
		}
			
		
		
	
	

}
