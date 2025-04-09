package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExtentManager {
    private static final ExtentReports extent = new ExtentReports();
    private static final ExtentSparkReporter sparkReporter = new ExtentSparkReporter("src/test/reports/ExtentReport.html");

    static {
        sparkReporter.config().setTheme(Theme.STANDARD);

        Properties config = new Properties();
        try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
            config.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties");
        }

        sparkReporter.config().setDocumentTitle(config.getProperty("report.title"));
        sparkReporter.config().setReportName(config.getProperty("report.name"));

        extent.setSystemInfo("Environment", config.getProperty("environment"));
        extent.setSystemInfo("Tester", config.getProperty("tester"));
        extent.attachReporter(sparkReporter);
    }

    public static ExtentReports getExtentReports() {
        return extent;
    }
}

