package package2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class pageread {
	public DesiredCapabilities get( )throws IOException

	{
		DesiredCapabilities caps = new DesiredCapabilities();
		InputStream is = new FileInputStream("C:\\Users\\User\\Desktop\\capabilitites.txt"); 
		BufferedReader buf = new BufferedReader(new InputStreamReader(is)); 
		String line = buf.readLine();
		StringBuilder sb = new StringBuilder(); 
		String[] arrOfStr;
	
		while(line != null)
		{ 
		sb.append(line).append("\n");
		
        arrOfStr = line.split(":"); 
		caps.setCapability(arrOfStr[0].toString(),arrOfStr[1].toString());
		

        line = buf.readLine();
	        
		}
		return caps;
}
}
