package listeners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import extentReport.ExtentManager;
import extentReport.ExtentTestManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    private ExtentReports extent = ExtentManager.getExtentReports();

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test suite started: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getName());

        ExtentTestManager.setTest(test);
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest().pass("Test Passed");
        ExtentTestManager.getTest().log(Status.PASS, "Test passed: " + result.getMethod().getMethodName());
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTestManager.getTest().fail(result.getThrowable());
        System.out.println("Test failed: " + result.getName());
        System.out.println("Reason: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest().skip("Test Skipped");
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush the report
        extent.flush();
        System.out.println("Test suite finished: " + context.getName());
    }
}
