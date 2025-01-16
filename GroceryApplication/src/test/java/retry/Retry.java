package retry;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry  implements IRetryAnalyzer{
	
	private static final Logger LOG = (Logger) LogManager.getLogger("Retry.class");  //logger is intialized to track and log test retry attempt using log4j.
	 private static final int maxTry = 3;  
	 private int count = 0;  //how many times retry attemped for the current testcases
	 public boolean retry(final ITestResult iTestResult) 
	 { 
	 	if (!iTestResult.isSuccess())  //check if the test fails
	 	{   
	 		if (this.count < maxTry)//retrycount<maxtry
	 		{      				 
	 			LOG.info("Retrying test " + iTestResult.getName() + " with status " 
	 						+ getResultStatusName(iTestResult.getStatus()) + " for the " + (this.count + 1) + " time(s).");   
	 		this.count++; 
	 		return true;   //indicates a retry attempt 
	 	} 
	 		 
	 	} 
	 	return false;   //no more retries, so the test will not rerun 
	 } 
	 public String getResultStatusName(final int status) { 
	 		String resultName = null; 
	 		if (status == 1) { 
	 			resultName = "SUCCESS"; 
	 		} 
	 		if (status == 2) { 
	 			resultName = "FAILURE"; 
	 		} 
	 		if (status == 3) { 
	 			resultName = "SKIP"; 
	 		} 
	 		return resultName; 
	 	}
	
	

}
