package pop_up;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithConfirmation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
//		driver.findElement(By.name("cusid")).sendKeys("123");
//		driver.findElement(By.name("submit")).click();
//		
//		Alert ale = driver.switchTo().alert();
//		Thread.sleep(2000);
//		ale.accept();
//		
//		Thread.sleep(2000);
//		ale.accept();
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		
		driver.close();
	}
}
