package package1;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Notifications {
	public void notification( AppiumDriver<MobileElement>driver) throws MalformedURLException,InterruptedException,IOException
	{
		
		MobileElement notify=driver.findElementByXPath(constant.Notifications);
		notify.click();
		
	}
	
	public void notifyevent( AppiumDriver<MobileElement>driver) throws MalformedURLException,InterruptedException,IOException
	{
		
		MobileElement notifyevent=driver.findElementByXPath(constant.notifyevent);
		notifyevent.click();

	}
	
	public void insideevent( AppiumDriver<MobileElement>driver) throws MalformedURLException,InterruptedException,IOException
	{
		
		
		//MobileElement insideevent=driver.findElementByXPath(constant.insideevent);
        //insideevent.click();
        MobileElement eventtext=driver.findElementByXPath(constant.Text);
        String h=eventtext.getText();
        System.out.print(h);
	}
	
	public void back ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	    {MobileElement Notification_back=driver.findElementByXPath(constant.Notification_back);
	    Notification_back.click();
	    }
	public void back1 ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
    {MobileElement Notification_back1=driver.findElementByXPath(constant.Notification_back1);
    Notification_back1.click();
    }
}
