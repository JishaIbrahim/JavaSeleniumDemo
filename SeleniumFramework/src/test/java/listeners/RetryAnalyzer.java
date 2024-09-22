package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public abstract class RetryAnalyzer implements IRetryAnalyzer {

		  private int retryCount = 0;
		  private static final int maxRetryCount = 3;

		  public boolean retry1(ITestResult result) {
		    if (retryCount < maxRetryCount) {
		      retryCount++;
		      return true;
		    }
		    return false;
		  }

		}

} 
