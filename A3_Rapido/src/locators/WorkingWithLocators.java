package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * 
		 * for (WebElement we : links) { System.out.println(we.getText()); }
		 */
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Thread.sleep(3000);
		driver.quit();
	}
}
