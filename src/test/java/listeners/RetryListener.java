package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryListener implements IRetryAnalyzer {
    private static final Logger logger = LoggerFactory.getLogger(RetryListener.class);
    private int retryCount = 0;
    private static final int maxRetryCount = 2;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            logger.info("Retrying test {} ({} out of {})", result.getName(), retryCount, maxRetryCount);
            return true;
        }
        logger.warn("Test {} failed after {} retries", result.getName(), maxRetryCount);
        return false;
    }
}
