package report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {
	public static void generateJvmReport(String jsonFile) throws FileNotFoundException,IOException {
		File reportDirectory=new File("C:\\SeleniumLearning\\cucumber\\src\\test\\resources\\JvmReport");
	Configuration config=new Configuration(reportDirectory,"cucumber");
		config.addClassifications("Browser","chrome");
		config.addClassifications("OS","Win11");
		
		List<String> jsonfile=new ArrayList<String>();
		jsonfile.add(jsonFile);
		ReportBuilder reportBuilder=new ReportBuilder(jsonfile, config);
		reportBuilder.generateReports();
	
	}

}
