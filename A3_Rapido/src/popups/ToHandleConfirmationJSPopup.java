package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationJSPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();

		// Confirmation Popup appears
		// Handle the popup
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); // click on OK Button
		// driver.switchTo().alert().dismiss(); //click on CANCEL Button

	}

}
