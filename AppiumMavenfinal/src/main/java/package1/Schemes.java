package package1;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Schemes {
	public void Schemesbutton( AppiumDriver<MobileElement>driver) throws MalformedURLException,InterruptedException,IOException
	{
		
		MobileElement button=driver.findElementByXPath(constant.Schemes_button);
		button.click();
		
	}
	
	
	public void Categoryevent( AppiumDriver<MobileElement>driver) throws MalformedURLException,InterruptedException,IOException
	{
		
		MobileElement categoryevent=driver.findElementByXPath(constant.categoryevent);
		categoryevent.click();

	}
	
	
	public void Schemesevent( AppiumDriver<MobileElement>driver) throws MalformedURLException,InterruptedException,IOException
	{
		
		MobileElement Schemesevent=driver.findElementByXPath(constant.Schemesevent);
		Schemesevent.click();

	}
	public void dropdown( AppiumDriver<MobileElement>driver) throws MalformedURLException,InterruptedException,IOException
	{
		
		MobileElement about=driver.findElementByXPath(constant.about);
		about.click();
		about.click();
		Thread.sleep(5000);
		MobileElement who_can_apply=driver.findElementByXPath(constant.who_can_apply);
		who_can_apply.click();
		Thread.sleep(2000);
		who_can_apply.click();
		Thread.sleep(5000);
		MobileElement offerings=driver.findElementByXPath(constant.offerings);
		offerings.click();
		Thread.sleep(2000);
		offerings.click();
		Thread.sleep(5000);
		MobileElement how_to_apply=driver.findElementByXPath(constant.how_to_apply);
		how_to_apply.click();
		Thread.sleep(2000);
		how_to_apply.click();
		Thread.sleep(5000);
		MobileElement person_of_contact=driver.findElementByXPath(constant.person_of_contact);
		person_of_contact.click();
		Thread.sleep(2000);
		person_of_contact.click();
		Thread.sleep(5000);
		MobileElement apply_now=driver.findElementByXPath(constant.apply_now);
		System.out.print("Apply button present" +apply_now.isDisplayed());
		
	}
	
	public void notification_back ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
    {MobileElement back1=driver.findElementByXPath(constant.back1);
    back1.click();
	MobileElement back2=driver.findElementByXPath(constant.back2);
    back2.click();
	MobileElement back3=driver.findElementByXPath(constant.back3);
    back3.click();
    }
}
