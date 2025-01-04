package methods_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Set;

public class OpenNewTabWithJavaScript {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");
		System.out.println("Facebook page opened in the first tab.");

		String parentWindow = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open();"); 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.remove(parentWindow);

		for (String handle : windowHandles) {
			driver.switchTo().window(handle); // Switch to the new tab
		}

		driver.get("https://www.instagram.com/");
		System.out.println("Instagram page opened in the new tab.");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

		driver.quit();
	}
}