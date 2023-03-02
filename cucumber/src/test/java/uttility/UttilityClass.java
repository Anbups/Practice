package uttility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UttilityClass {
	private static UttilityClass uttility;
	public static UttilityClass getInstance() {
		if(uttility==null) {
			uttility=new UttilityClass();
		}
		return uttility;
	}
	public String readPropertyFile(String key) throws IOException {
		File file=new File("C:\\SeleniumLearning\\cucumber\\src\\test\\resources\\config.properties");
		FileInputStream stream=new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(stream);
		String property = properties.getProperty(key);
		return property;
		
	}

}
