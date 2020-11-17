package package1;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class login {
	public void guest( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	{   
		MobileElement user=driver.findElementByXPath(constant.user);
		user.click();
		
	}
	/*public void email( AppiumDriver<MobileElement>driver) throws MalformedURLException,InterruptedException,IOException
	{
		
		MobileElement email=driver.findElementByXPath(constant.emailfield);
		email.click();
		email.clear();
		email.sendKeys(constant.email);
	}
	
	public void password( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	{   
		MobileElement password=driver.findElementByXPath(constant.passwordfield);
		password.click();
		password.clear();
		password.sendKeys(constant.password);
	}
	
	

    public void signin( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
    { 
      MobileElement sign_in=driver.findElementByXPath(constant.sign_in);
      sign_in.click();
    }*/
   
}
