package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Checkout_Overview extends Checkout_information_page {
	
	@Test(priority = 5)
	public void Checkprice() {
		
		
WebElement itemprice =driver.findElement(By.xpath(pagelocaters.getProperty("TOTAL_PRICE_without_tax")));
String Allitemprice = itemprice.getText();
WebElement taxprice =driver.findElement(By.xpath(pagelocaters.getProperty("TOTAL_TAX")));
String Alltaxprice = taxprice.getText();
WebElement totalprice =driver.findElement(By.xpath(pagelocaters.getProperty("TOTAL_PRICE")));
		String ALLtotalprice = totalprice.getText();
		
		
		
		System.out.println(Allitemprice);
		System.out.println(Alltaxprice);
		System.out.println(ALLtotalprice);
		
	
		
		if(!Alltaxprice.isBlank()) {
			
			driver.findElement(By.xpath(pagelocaters.getProperty("FINISH_BUTTON"))).click();
			
		}
		else {
			
			System.out.println("Tax not showing");
		}
		
		
		
	}
		
	}
	

