package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.makemytrip.com/");
		
		// to close the ad popup
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		// click on departure
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='January 2025']/../..//p[text()='14']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}
