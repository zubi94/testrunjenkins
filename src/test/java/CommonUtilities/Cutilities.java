package CommonUtilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Cutilities {
	
	static String filePath = "C:\\Users\\lala94\\eclipse-workspace\\practiceframework\\Screenshots\\";
	protected static WebDriver driver;
	@Parameters({"browser","URL"})
	@BeforeClass
	public void browsers(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lala94\\Desktop\\Selenium misc files\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get(url);
			  driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lala94\\Desktop\\Selenium misc files\\Firefox web driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}else {
			System.out.println("Browser name not correct");
		}
	}
		  @AfterClass
		  public void afterClass() {
			driver.close();
		  }
	
	
	public static void date() {
	      Date dt = new Date();
	      DateFormat dateFormat;
	      
	      // Displaying time with FULL constant and region specific
	     
	      dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.UK);
	      System.out.println("Locale UK = " +dt);
	      
	      dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.US);
	      System.out.println("Locale USA = " + dateFormat.format(dt));
	   }
	public static void datesmall() {
		String pattern = "MM-dd-yy-hh-mm";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
	}
	
	public void Screenshot() throws IOException {
		Calendar dt=new GregorianCalendar();
		int yr=dt.get(Calendar.YEAR);
		int mon=dt.get(Calendar.MONTH);
		int day=dt.get(Calendar.DAY_OF_MONTH);
		int hr=dt.get(Calendar.HOUR);
		int min=dt.get(Calendar.MINUTE);
		int sec=dt.get(Calendar.SECOND);
		
		File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File(filePath+yr+"_"+mon+"_"+day+"_"+hr+"_"+min+"_"+sec+".jpg"));
				}
	}
		
	

