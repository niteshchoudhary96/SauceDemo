package Utils;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class ScreenShotOnFailed extends Failed_Retry {
public WebDriver driver;
		public void takeSCREENshot() throws IOException {
		
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File add = new File("C:\\Users\\nites\\OneDrive\\Desktop\\Practice\\SauceDemo\\ScreenShots");
		
		FileUtils.copyFile(screen, add);
		
		
	}
	
	
}
