package package2;

import java.util.Set;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class select {
	public String selectContext(AppiumDriver<MobileElement>driver) throws InterruptedException
	{ 
	 Set<String>contextName = driver.getContextHandles();
	 
	 for (String context : contextName) 
	 {System.out.print(context);
		 
	 if (!context.equals("NATIVE_APP")) {
		 return context;
		 }
		 }
		 return ("NATIVE_APP");
		
	
}
}
