package pop_up;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class WorkingWithNP {

	public static void main(String[] args) {
		ChromeOptions setting = new ChromeOptions();
			
		setting.addArguments("--disable-notifications");
//		setting.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(setting);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.easemytrip.com/");
		
		
	}

}
