package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String path = System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getProperties();
		setProperties();

	}
	
	public static void getProperties()
	{
		try {
		
		InputStream input = new FileInputStream(path+"/src/test/java/config/config.properties");
		prop.load(input);
		String property = prop.getProperty("browser");
	System.out.println(property);
		//GoogleTestNG.browserName =  property;
		
		}
		
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	}

	public static void setProperties()
	{
		try {
			OutputStream output = new FileOutputStream(path+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
		
	}
}
