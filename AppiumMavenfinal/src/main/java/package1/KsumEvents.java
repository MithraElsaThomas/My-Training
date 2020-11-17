package package1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class KsumEvents {
	 public void Ksum ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException{
	    	MobileElement Ksum_event=driver.findElementByXPath(constant. Ksum);
	    	Ksum_event.click();
	}
	 public void Ksumdate ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException, ParseException{
	    	MobileElement Ksumdate=driver.findElementByXPath(constant. Ksumdate);
	    	String ds=Ksumdate.getText();
	    	Date d;
		
				d = new SimpleDateFormat("dd-MM-yy").parse(ds);
			
	    	System.out.print("KSUM EVENT DATE" +d);
	    	Ksumdate.click();
//	    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
			   
	    	Date today =new Date();
	    	Date formattedDate=today;
//			   String formattedDate = new SimpleDateFormat().parse(today);
			   System.out.print("TODAY'S DATE" +today); 
			   if (today.compareTo(d) > 0) {
				   MobileElement Ksumregister=driver.findElementByXPath(constant.Ksumregister);
				    System.out.println(Ksumregister.isDisplayed());
				    System.out.println("Register button not present");
		            System.out.println("Date1 is after Date2");
		        } else if (formattedDate.compareTo(d) < 0) {
		        	MobileElement Ksumregister=driver.findElementByXPath(constant.Ksumregister);
				    System.out.println(Ksumregister.isDisplayed());
				    System.out.println("Register button present");
		            System.out.println("Date1 is before Date2");
		        } else if (formattedDate.compareTo(d) == 0) {
		        	MobileElement Ksumregister=driver.findElementByXPath(constant.Ksumregister);
		            System.out.println(Ksumregister.isDisplayed());
		            System.out.println("Register button present");
		            System.out.println("Date1 is equal to Date2");
		        } else {
		            System.out.println("Invalid");
		        }
	    }
	    /*public void Ksumdate ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException{
	    	MobileElement Ksumdate=driver.findElementByXPath(constant. Ksumdate);
	    	String d=Ksumdate.getText();
	    	System.out.print("KSUM EVENT DATE" +d);
	    	Ksumdate.click();
	    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
			   
	    	LocalDateTime now = LocalDateTime.now();
	    	 LocalDate today = LocalDate.now();   
			   String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
			   System.out.print("TODAY'S DATE" +formattedDate); 
			   if (formattedDate.compareTo(d) > 0) {
				   
				    System.out.println("Register button not present");
		            System.out.println("Date1 is after Date2");
		        } else if (formattedDate.compareTo(d) < 0) {
		        	MobileElement Ksumregister=driver.findElementByXPath(constant.Ksumregister);
				    System.out.println(Ksumregister.isDisplayed());
				    System.out.println("Register button present");
		            System.out.println("Date1 is before Date2");
		        } else if (formattedDate.compareTo(d) == 0) {
		        	MobileElement Ksumregister=driver.findElementByXPath(constant.Ksumregister);
		            System.out.println(Ksumregister.isDisplayed());
		            System.out.println("Register button present");
		            System.out.println("Date1 is equal to Date2");
		        } else {
		            System.out.println("Invalid");
		        }
	    }*/
	    public void back ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	    {MobileElement Ksum_back=driver.findElementByXPath(constant.Ksum_back);
	    Ksum_back.click();
	    }   
}
