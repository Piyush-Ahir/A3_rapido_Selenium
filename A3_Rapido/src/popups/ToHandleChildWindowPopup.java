package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'POCO M6 5G, Orion Blue (4GB, 64GB)')]")).click();
		String parentID = driver.getWindowHandle();
		Set<String> allIDs = driver.getWindowHandles();
		allIDs.remove(parentID);
		for(String windowId:allIDs) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.xpath("//span[@id='acrCustomerReviewText']")).click();
		Thread.sleep(3000);
		driver.close(); //child window closes
		driver.switchTo().window(parentID);
		Thread.sleep(3000);
		driver.quit();
		

}
}
