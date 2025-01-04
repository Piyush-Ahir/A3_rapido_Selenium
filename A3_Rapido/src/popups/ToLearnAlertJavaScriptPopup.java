package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAlertJavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		//alert popup appears
		//Handle the popup
		Alert alertPopup = driver.switchTo().alert();
		Thread.sleep(3000);
		alertPopup.accept();
		driver.findElement(By.id("small-searchterms")).sendKeys("Anjali");

	}

}
