package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandlePromptJSPopup {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.setImplicitWaitTimeout(Duration.ofSeconds(15));
		opt.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame(1);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		Alert promptPopup = driver.switchTo().alert();
//
//		promptPopup.sendKeys("Vasu");
		// promptPopup.accept();
//		promptPopup.dismiss();
		System.out.println("Alert dismissed successfully!!!");
		
		driver.close();
	}

}
