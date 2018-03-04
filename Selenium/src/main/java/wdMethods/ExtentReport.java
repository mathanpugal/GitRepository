package wdMethods;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html = new ExtentHtmlReporter(new File("./reports/result.html"));
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("CretaeLead", "Create New Lead");
		test.assignAuthor("Mathan");
		test.assignCategory("Regression");
		test.pass("User Name entered Successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpeg", "Username").build());
		extent.setAnalysisStrategy(AnalysisStrategy.TEST);
		extent.flush();
	}

}
