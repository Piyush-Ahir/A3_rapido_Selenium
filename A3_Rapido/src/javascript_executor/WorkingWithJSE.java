package javascript_executor;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithJSE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("document.location='https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html'");
		
		driver.findElement(By.linkText("jdk-23.0.1_doc-all.zip")).click();

		WebElement btn = driver.findElement(By.xpath("//a[text()='Download jdk-23.0.1_doc-all.zip']")); //.click();
//		btn.click();
		
		jse.executeScript("arguments[0].click()", btn);
		System.out.println("Started downloading successfully !!!");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
