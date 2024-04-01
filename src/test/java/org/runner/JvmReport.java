package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;



public class JvmReport {
	
	public static void getJvmReport(String Jsonpath) {
		
//		File f = new File("All Reports\\JVM Report");
//		
//		Configuration c = new Configuration(f, "Overstockart");
//		
//		c.addClassifications("application", "Overstockart");
//		c.addClassifications("platform", "Chromebrowser");
//		c.addClassifications("OS", "Windows 11");
//		
//		List<String> l = new ArrayList();
//		l.add(Jsonpath);
//		
//		
//		ReportBuilder r = new ReportBuilder(l, c);
//		Reportable ge = r.generateReports();
	
	File f = new File("All Reports\\JVM Report");
	
	Configuration c = new Configuration(f, "Ecommerce");
	c.addClassifications("application", "Overstockart");
	c.addClassifications("Platform", "Chrome");
	c.addClassifications("OS", "Windows 11");
	c.addClassifications("Date", "30.09.2023");
	
	List<String> a = new ArrayList<String>();
	a.add(Jsonpath);
	
	ReportBuilder r = new ReportBuilder(a, c);
	Reportable re = r.generateReports();
	
	
		
		
		
		
		
		
		

	}
	

}
