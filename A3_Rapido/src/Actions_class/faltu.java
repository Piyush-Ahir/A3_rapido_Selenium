package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class faltu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		/* Right Click */
//		driver.get("https://www.google.co.in/");
//		WebElement search = driver.findElement(By.name("q"));
//		
		Actions act = new Actions(driver);
//		act.contextClick(search).build().perform();
		
		/* Hover */
//		driver.get("https://demowebshop.tricentis.com/");
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.partialLinkText("Computers"))).perform();
		
		/* Double click */
//		driver.get("https://demoapp.skillrary.com/product.php");
//		WebElement addBtn = driver.findElement(By.id("add"));
//		
//		act.doubleClick(addBtn).build().perform();
		
		/* Click and Hold */
//		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
//		driver.findElement(By.id("password")).sendKeys("1234567");
//		
//		WebElement eye = driver.findElement(By.xpath("//div[@tabindex='0']"));
//		act.clickAndHold(eye).build().perform();
//		
//		Thread.sleep(2000);
//		act.release().build().perform();
		
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Thread.sleep(5000);
//		WebElement seoul = driver.findElement(By.id("box5"));
//		WebElement SK = driver.findElement(By.id("box105"));
		
//		act.dragAndDrop(seoul,SK).build().perform();
//		act.dragAndDropBy(	, 0, 0);
		
//		act.scrollToElement(driver.findElement(By.partialLinkText("Security tips"))).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Security tips")).click();
		act.scrollByAmount(0, 700).perform();
		
	}

}
