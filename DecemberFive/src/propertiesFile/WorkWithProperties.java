package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class WorkWithProperties {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/propertiesFile/Global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Browsertype"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("TestEnvi"));
	}

}
