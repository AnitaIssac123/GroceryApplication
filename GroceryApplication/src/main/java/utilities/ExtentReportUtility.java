package utilities;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


 
	 public class ExtentReportUtility {
		 public static final ExtentReports extentReports = new ExtentReports();   //Creates a single, globally accessible instance of ExtentReports

			public synchronized static ExtentReports createExtentReports() {    //Synchronized ensures thread safety when accessed by multiple threads in parallel testing.

				ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html"); 
				//handles creation and configuration of html report
				//specifies the file path where the report will be saved (extent-report.html in the extent-report

				reporter.config().setReportName("GroceryApplication");  //Sets the title or name of the report to "GroceryApplication".
				extentReports.attachReporter(reporter);   //Attaches the ExtentSparkReporter configuration to the ExtentReports instance.
				extentReports.setSystemInfo("Organization", "Obsqura");  //Adds system-level information to the report (metadata).
				extentReports.setSystemInfo("Name", "Anita ");
				return extentReports;
				//ExtendSparkReporter handles the creation and configuration of html report
		 //Extendreports -managing the lifecycle of reports to connect with overall report
				//Extendtest represents each testcase that is added to the report
	 }}
	 
	 