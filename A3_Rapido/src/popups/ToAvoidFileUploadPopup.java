package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.id("resumeUpload")).sendKeys("C:/Users/User/Desktop/demo.docx");
		
		driver.close();
	}

}
