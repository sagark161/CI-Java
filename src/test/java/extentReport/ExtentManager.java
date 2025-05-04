package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import utils.FileReaderUtility;

import java.util.Properties;

public class ExtentManager {
    private static final ExtentReports extent = new ExtentReports();
    private static final ExtentSparkReporter sparkReporter;

    static {
        // Load extent-report-config.properties using FileReaderUtility
        Properties config = FileReaderUtility.readPropertiesFile("src/test/resources/extent-report-config.properties");

        // Load paths.properties using FileReaderUtility
        String reportLocation = config.getProperty("report.location", "src/test/reports/");
        String reportFileName = "TestReport_" + System.currentTimeMillis() + ".html";
        String reportFilePath = reportLocation + reportFileName;

        // Initialize ExtentSparkReporter
        sparkReporter = new ExtentSparkReporter(reportFilePath);
        sparkReporter.config().setTheme(Theme.STANDARD);

        // Load extent-report-config.properties using FileReaderUtility
        sparkReporter.config().setDocumentTitle(config.getProperty("report.title", "Test Report"));
        sparkReporter.config().setReportName(config.getProperty("report.name", "Automation Report"));

        // Set system info
        extent.setSystemInfo("Environment", config.getProperty("environment", "QA"));
        extent.setSystemInfo("Tester", config.getProperty("tester", "Unknown"));
        extent.attachReporter(sparkReporter);
    }

    public static ExtentReports getExtentReports() {
        return extent;
    }
}