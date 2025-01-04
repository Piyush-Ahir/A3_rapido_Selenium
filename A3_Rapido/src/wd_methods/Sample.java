package wd_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//				ṃanage
//		
//		Window win = driver.manage().window();
//		
//		win.maximize();
//		win.minimize();
//		win.fullscreen();
//		
//		Dimension dim = win.getSize();
//		win.setSize(dim);
//		Point pt = win.getPosition();
//		win.setPosition(pt);

//		driver.get("https://www.facebook.com/");
//		
//		/*
//		 * step 1 
//		 * step 2 
//		 * step 3
//		 * 
//		 * 
//		 * 
//		 * 
//		 */
//		Navigation nav = driver.navigate();
//		
//		nav.to("https://www.instagram.com/");
//		Thread.sleep(2000);
//		nav.back();
//		Thread.sleep(2000);
//		nav.refresh();
//		Thread.sleep(2000);
//		nav.forward();
		
		driver.get("https://www.shoppersstack.com/products_page/24");
		Thread.sleep(20000);
		
		String paretntID = driver.getWindowHandle();
		System.out.println("Parent ID : "+paretntID);

		driver.findElement(By.id("compare")).click();
		
		Set<String> IDs = driver.getWindowHandles();
		IDs.remove(paretntID);
		
		for (String id : IDs) {
			driver.switchTo().window(id);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.close();
			Thread.sleep(1000);
		}

//		driver.quit();
	}
}
