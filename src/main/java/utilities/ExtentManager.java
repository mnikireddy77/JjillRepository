//package utilities;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class ExtentManager {
//    public static final ExtentReports extentReports = new ExtentReports();
//    public synchronized static ExtentReports createExtentReports() {
//        ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user-dir")+"/test-output/extent-report.html");
//        reporter.config().setReportName("Extent Report"+System.currentTimeMillis());
//        extentReports.attachReporter(reporter);
//        extentReports.setSystemInfo("Nikhitha","JJILL Testing");
//        return extentReports;
//    }
//}