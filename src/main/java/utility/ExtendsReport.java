package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReport {
public static ExtentReports getReport() {
		
		ExtentSparkReporter reporter= new ExtentSparkReporter("./reports/report.html");
		reporter.config().setReportName("Best Buy Reporter");
		reporter.config().setDocumentTitle("BestBuy Reporter title");
		
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
		
	}

}
