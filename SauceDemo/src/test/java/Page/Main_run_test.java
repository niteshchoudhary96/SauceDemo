package Page;

import org.testng.annotations.Test;

public class Main_run_test extends BacktoLogin{
	
	@Test
	public void completeCheckoutFlow() {
	    loginpage();
	    MainproductScreen();
	    CheckoutItemList();
	    information();
	    Checkprice();
	    Confirmtext();
	    GotoLoginScreen();
	}


}
