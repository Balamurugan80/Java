package org.stepdefinition.com;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReporting  {
	
	
	public static void generateJVMreport(String jsonpth) {
		
File f=new File("C:\\Users\\Manoj Kumar A\\eclipse-workspace\\Cucumber\\Reports\\JVMReport");


Configuration c=new Configuration(f, "FB");

c.addClassifications("platform", "version");



 List <String> l=new ArrayList<String>();
 l.add(jsonpth);
 ReportBuilder r=new ReportBuilder(l, c);
 r.generateReports();
 

	}

}
