package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopup {

	public static void main(String[] args) {
		// to avoid notification popup
		ChromeOptions settings = new ChromeOptions();

		settings.addArguments("--disable-notifications");
//		settings.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.irctc.co.in/nget/train-search");
	}

}
