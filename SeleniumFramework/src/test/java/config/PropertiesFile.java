package config;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static void getProperties(){
	  try {	
		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");
		InputStream input = new FileInputStream(projectPath+"src/test/java/config/config.properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
	  }catch(Exception exp) {
		  System.out.println(exp.getMessage());  
		  System.out.println(exp.getCause());
		  exp.printStackTrace();
		  
	  
	  }
	}
}

