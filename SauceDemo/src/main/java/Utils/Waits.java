package Utils;

import org.openqa.selenium.WebElement;

public interface Waits {
	
	  public void ImplicitWait ();
	  public void ExplicitWait (WebElement element, int timeoutSec);
	  public void FluenWait (WebElement element, int timeoutSec, int pollingSec);
   
	
	
	

}




