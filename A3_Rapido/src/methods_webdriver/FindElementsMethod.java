package methods_webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/17");
		Thread.sleep(30000);
		
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");	
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
//		wait.pollingEvery(Duration.ofSeconds(1));
//		wait.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));

		driver.findElement(By.id("Check")).click();

//		List<WebElement> span = driver.findElements(By.tagName("span"));
//
//		for (WebElement we : span) {
//			String text = we.getText();
//			System.out.println(text);
//		}
//		driver.quit();
	}

}
