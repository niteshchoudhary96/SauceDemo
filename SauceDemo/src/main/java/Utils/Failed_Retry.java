package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Failed_Retry  implements IRetryAnalyzer {

    private int retryCount  = 0;
    private static final int maxRetryCount = 5;

	@Override
	@Test
	public boolean retry(ITestResult result) {
		
		if(retryCount <maxRetryCount) {
			retryCount ++;
			return true;
		}
		return false;
	}
	
	
	
}
