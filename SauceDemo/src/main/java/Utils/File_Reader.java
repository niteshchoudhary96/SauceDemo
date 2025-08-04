package Utils;

import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;

public class File_Reader extends ScreenShotOnFailed {
	
	public FileReader fr;
	public FileReader fr1;
	public Properties pagelocaters;
	public Properties websitedetails;
	
	@BeforeTest
	public void ReadData() throws IOException{
		
	
			 fr = new FileReader("C:\\Users\\nites\\OneDrive\\Desktop\\Practice\\SauceDemo\\resource\\Page_Locaters");
		
		pagelocaters = new Properties();
		pagelocaters.load(fr);
		
		 fr1 = new FileReader("C:\\Users\\nites\\OneDrive\\Desktop\\Practice\\SauceDemo\\resource\\Website_Details");
		websitedetails = new Properties();
		websitedetails.load(fr1);

	
		
		
		
	}

}
