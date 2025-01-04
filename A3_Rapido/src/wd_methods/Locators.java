package wd_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		/* locators */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://facebook.com/");

//		id
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("qspidrs@gmail.com");

//		name
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345678");

		Thread.sleep(2000);

//		linktext
//		WebElement forgotPass = driver.findElement(By.linkText("Forgotten password?"));
//		forgotPass.click();

//		partial link text
//		WebElement forgotPass = driver.findElement(By.partialLinkText("Forgotten"));
//		forgotPass.click();
		
//		class
//		WebElement createPage = driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));
//		createPage.click();
		
//		tagname
		WebElement button = driver.findElement(By.tagName("button"));
		button.click();

		Thread.sleep(2000);
		driver.close();
	}
}
