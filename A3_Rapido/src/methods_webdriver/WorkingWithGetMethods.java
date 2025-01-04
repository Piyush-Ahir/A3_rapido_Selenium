package methods_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/products_page/17");
		Thread.sleep(20000);
		/*
		 * 
		 * String title = driver.getTitle(); 
		 * System.out.println(title);
		 * 
		 * String url = driver.getCurrentUrl(); 
		 * System.out.println(url);
		 * 
		 * String source = driver.getPageSource(); 
		 * System.out.println(source);
		 * 
		 */
		
		driver.findElement(By.id("compare")).click();
		
		driver.close();		
	}

}
