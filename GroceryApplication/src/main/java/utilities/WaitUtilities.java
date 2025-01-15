package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {
	public static int Implicitwait=10;
	public static int Explicitwait=10;
	public static int fluentwait=2;
	public void fluentWaitElements(WebDriver driver, WebElement element, String attribute, String attributeValue,
			int total) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(total))
				.pollingEvery(Duration.ofSeconds(fluentwait)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));
	}
	public void waitForWebElementAlert1(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	 public void elementIsvisible(WebDriver driver, WebElement element)
	 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }
	 public void waitUntilTextShows(WebDriver driver,WebElement element,String value) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Explicitwait));
			wait.until(ExpectedConditions.textToBePresentInElement(element, value));
		}
		public void waitUntilElementIsVisible(WebDriver driver,WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Explicitwait));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
	public void waitUntilClickable(WebDriver driver,WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Explicitwait));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public void waitForWebElementTitle(WebDriver driver,WebElement element,String attribute,String value) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Explicitwait));
			wait.until(ExpectedConditions.titleIs(value));
		}

	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
