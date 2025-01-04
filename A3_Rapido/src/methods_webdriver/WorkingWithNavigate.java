package methods_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigate {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * navigate()
		 * to(String url)
		 * to(URL url)
		 * forward()
		 * back()
		 * refresh()
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		Navigation nav = driver.navigate();
//		nav.to("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		
		nav.back();
		nav.refresh();
		nav.forward();
		
		System.out.println("successfully went to fb");
		
		driver.quit();
	}

}
