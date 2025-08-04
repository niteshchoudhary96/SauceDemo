package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Main_Items_page extends LogIn_Page {

	@Test(priority = 2)
	public void MainproductScreen()  {

		List<WebElement> Allproduct = driver.findElements(By.xpath(pagelocaters.getProperty("Iteam_list")));
;
		for (WebElement list : Allproduct) {
			String AllList = list.getText();

			if (AllList.contains("Sauce Labs Backpack")) {

				driver.findElement(By.xpath(pagelocaters.getProperty("ADD_TO_CART_BACKPCK"))).click();
				System.out.println("Backpack added");
				
				driver.findElement(By.xpath(pagelocaters.getProperty("ADD_TO_CART_T_SHIRT"))).click();
				System.out.println("T-shirt added");
			} 

			
			

		}

	}

}
