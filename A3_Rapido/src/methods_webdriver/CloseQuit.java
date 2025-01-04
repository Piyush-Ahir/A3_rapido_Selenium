package methods_webdriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseQuit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/17");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//		WebElement compareButton = ;
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("compare"))));

		driver.findElement(By.id("compare")).click();

		Thread.sleep(2000);

		driver.close();
	}
}
