package protraining.testrun;

import org.testng.annotations.Test;
import CommonUtilities.Cutilities;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Parameters;


public class Newaccount extends Cutilities{
    
  @Test
  @Parameters({"eml","fname","lname","phone","psd"})
  public void createaccount(String a,String b, String c, String d, String e) throws IOException {

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	createaccount cacc=new createaccount(driver);
	
	cacc.menu();
	cacc.n_acc();
	cacc.user(a);
	cacc.firstname(b);
	cacc.last(c);
	cacc.phone(d);
	cacc.psd(e);
	cacc.read();
	// Taking screenshot using listener class, thats why we are not using screenshot method here
	//Screenshot();
	//cacc.submit();
	
  }
}
  