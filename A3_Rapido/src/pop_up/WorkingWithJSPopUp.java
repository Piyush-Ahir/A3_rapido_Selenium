package pop_up;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithJSPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
		driver.findElement(By.id("login1")).sendKeys("123456789");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(1000);

		Alert ale = driver.switchTo().alert();
		ale.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		/*
		 * when we perform some actions without handling the alert, we wil
		 * get UnhandledAlertException
		*/
		Thread.sleep(1000);
		driver.close();
	}

}
