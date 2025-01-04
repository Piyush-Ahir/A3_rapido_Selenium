package select_class;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectClass {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setImplicitWaitTimeout(Duration.ofSeconds(15));
		opt.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		driver.switchTo().frame("iframeResult");

//		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		WebElement multi = driver.findElement(By.id("cars"));
		Select s1 = new Select(multi);

//		System.out.println(s1.isMultiple());

		s1.selectByIndex(3);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
//		s1.selectByIndex(0); 

		String firstSelected = s1.getFirstSelectedOption().getText();
		System.out.println(firstSelected);

//		s1.deselectByIndex(2);
//		
//		List<WebElement> options = s1.getAllSelectedOptions();
//		for (WebElement opt : options) {
//			System.out.println(opt.getText());
//		}

//		s1.selectByIndex(5); arrayOutOfBound

//		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

//		WebElement dayDD = driver.findElement(By.id("day"));

//		Select sObj = new Select(dayDD);
////		sObj.selectByIndex(29);
//		List<WebElement> options = sObj.getOptions();
//		for (WebElement opt : options) {
//			System.out.println(opt.getText());
//		}

//		WebElement monthDD =  driver.findElement(By.id("month"));
//		sObj = new Select(monthDD);
//		sObj.selectByValue("9");
//		
//		WebElement yearDD =  driver.findElement(By.id("year"));
//		sObj = new Select(yearDD);
//		sObj.selectByVisibleText("1998");

		driver.close();
	}
}
