package package1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import package2.pageread;
import package2.select;

public class BaseClass {
	WebDriver driver1;
	/*@BeforeTest
	public void beforeTest() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chrome\\chromedriver.exe");
		    driver1=new ChromeDriver();
			driver1.get("http://demo.guru99.com/test/delete_customer.php");
			driver1.manage().window().maximize();
	  }*/
	AppiumDriver<MobileElement>driver;
	@Test(priority=1,enabled=true)
	public void start() throws MalformedURLException,InterruptedException,IOException{
	//public static void main(String[] args)throws MalformedURLException,InterruptedException,IOException  {
	  //AppiumDriver<MobileElement>driver;
		 pageread ob=new pageread();
			DesiredCapabilities caps1 = new DesiredCapabilities();
			caps1=ob.get();
		    driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps1);
		    select ob2=new select();
		    String a = ob2.selectContext(driver);
		    driver.context(a);
			Thread.sleep(2000);
	}
 @Test(priority=2,enabled=true)
   public void login()throws MalformedURLException,InterruptedException,IOException{
			login ob1 =new login();
			Thread.sleep(5000);
			ob1.guest(driver);
			//ob1.email(driver);
			//ob1.password(driver);
			//ob1.signin(driver);
			Thread.sleep(5000);
   }
@Test(priority=3,enabled=true)
public void AllEvents()throws MalformedURLException,InterruptedException,IOException, ParseException{
			AllEvents ob3= new AllEvents();//TC 02
			ob3.startup(driver);
			Thread.sleep(15000);
			ob3.date(driver);
			Thread.sleep(5000);
			ob3.back(driver);
			Thread.sleep(5000);
			ob3.upcomingevents(driver);
			Thread.sleep(5000);
			ob3.allevents(driver);
			Thread.sleep(8000);
		    ob3.back(driver);
		    Thread.sleep(5000);
}
/*@Test(priority=4,enabled=true)
public void KsumEvents()throws MalformedURLException,InterruptedException,IOException, ParseException{
			KsumEvents ob5= new KsumEvents();//TC 03
		    Thread.sleep(8000);
			ob5.Ksum(driver);
			Thread.sleep(20000);
			ob5.Ksumdate(driver);
			Thread.sleep(8000);
			ob5.back(driver);
			Thread.sleep(5000);
			ob5.back(driver);
			Thread.sleep(5000);
}
@Test(priority=5,enabled=true)
public void Notifications()throws MalformedURLException,InterruptedException,IOException{
			Notifications ob6=new Notifications();
			Thread.sleep(5000);
			ob6.notification(driver);
			Thread.sleep(5000);
			ob6.notifyevent(driver);
		    Thread.sleep(20000);
		    ob6.back(driver);
		    Thread.sleep(5000);
		    ob6.back1(driver);
}
@Test(priority=6,enabled=true)
public void Schemes()throws MalformedURLException,InterruptedException,IOException{  
		    Schemes ob7 =new Schemes();
		    Thread.sleep(5000);
		    ob7.Schemesbutton(driver);
		    Thread.sleep(5000);
		    ob7.Categoryevent(driver);
		    Thread.sleep(5000);
		    ob7.Schemesevent(driver);
		    Thread.sleep(5000);
		    ob7.dropdown(driver);
		    Thread.sleep(5000);
		    ob7.notification_back(driver);
}*/
@Test(priority=7,enabled=true)
public void logout()throws MalformedURLException,InterruptedException,IOException{
		    logout ob8= new logout();
		    ob8.logouticon(driver);
		    Thread.sleep(5000);
		    //ob8.signout(driver);
		    driver.closeApp();
		}
/*@AfterTest
public void afterTest() {
	System.out.println("passed");
	  driver1.close();
	  
}*/
}
