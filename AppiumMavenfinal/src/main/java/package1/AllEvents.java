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

public class AllEvents {
	 public void startup( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	    {
	    	MobileElement start_up=driver.findElementByXPath(constant.start_up);
	    	start_up.click();
	    	


	    }
	 public void date( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException, ParseException
	    {MobileElement date=driver.findElementByXPath(constant.date);
	
	String ds=date.getText();
	Date d;

		d = new SimpleDateFormat("dd-MM-yy").parse(ds);
	
	System.out.print("ALL EVENT DATE" +d);
	date.click();
//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	   
	Date today =new Date();
	Date formattedDate=today;
//	   String formattedDate = new SimpleDateFormat().parse(today);
	   System.out.print("TODAY'S DATE" +today); 
	   if (today.compareTo(d) > 0) {
		   MobileElement AllEventregister=driver.findElementByXPath(constant.AllEventregister);
		    System.out.println(AllEventregister.isDisplayed());
		    System.out.println("Register button not present");
         System.out.println("Date1 is after Date2");
     } else if (formattedDate.compareTo(d) < 0) {
     	MobileElement AllEventregister=driver.findElementByXPath(constant.AllEventregister);
		    System.out.println(AllEventregister.isDisplayed());
		    System.out.println("Register button present");
         System.out.println("Date1 is before Date2");
     } else if (formattedDate.compareTo(d) == 0) {
     	MobileElement AllEventregister=driver.findElementByXPath(constant.AllEventregister);
         System.out.println(AllEventregister.isDisplayed());
         System.out.println("Register button present");
         System.out.println("Date1 is equal to Date2");
     } else {
         System.out.println("Invalid");
     }
	    }
	    /*public void date( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	    {MobileElement date=driver.findElementByXPath(constant.date);
	String d=date.getText();
	System.out.print("ALLEVENT DATE" +d);
	date.click();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   
	LocalDateTime now = LocalDateTime.now();
	 LocalDate today = LocalDate.now();   
		   String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
		   System.out.print("TODAY'S DATE" +formattedDate); 
		   if (formattedDate.compareTo(d) > 0) {
			   
			    System.out.println("Register button not present");
	            System.out.println("Date1 is after Date2");
	        } else if (formattedDate.compareTo(d) < 0) {
	        	MobileElement AllEventregister=driver.findElementByXPath(constant.AllEventregister);
			    System.out.println(AllEventregister.isDisplayed());
			    System.out.println("Register button present");
	            System.out.println("Date1 is before Date2");
	        } else if (formattedDate.compareTo(d) == 0) {
	        	MobileElement AllEventregister=driver.findElementByXPath(constant.AllEventregister);
	            System.out.println(AllEventregister.isDisplayed());
	            System.out.println("Register button present");
	            System.out.println("Date1 is equal to Date2");
	        } else {
	            System.out.println("Invalid");
	        }
}*/
	    
	    public void upcomingevents ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	    {MobileElement upcoming=driver.findElementByXPath(constant.upcoming);
	    upcoming.click();
	    }
	    
	    public void back ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	    {MobileElement back=driver.findElementByXPath(constant.back);
	    back.click();
	    }
	    public void allevents ( AppiumDriver<MobileElement>driver)throws MalformedURLException,InterruptedException,IOException
	    {MobileElement allevents=driver.findElementByXPath(constant.allevents);
	    allevents.click();
	    }
	    
}
