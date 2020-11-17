package package1;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class logout {
	public void logouticon( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
    { 
      MobileElement log_out_icon=driver.findElementByXPath(constant.log_out_icon);
      log_out_icon.click();
    }
    
    /*public void signout( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
    { 
      MobileElement sign_out=driver.findElementByXPath(constant.sign_out);
      sign_out.click();
    }*/
}
