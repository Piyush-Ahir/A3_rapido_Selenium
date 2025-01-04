package methods_webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/24");
		Thread.sleep(10000);

		String parentId = driver.getWindowHandle();

		driver.findElement(By.id("compare")).click();

		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		
		for (String id : childIds) {
//			driver.switchTo().window(id);
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
			Thread.sleep(3000);
			driver.close();
		}
		
//		System.out.println(parentId + childIds);
		driver.switchTo().window(parentId);
		
		driver.close();
	}
}
