package takes_screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class WorkingWithScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");


//		TakesScreenshot ts = (TakesScreenshot) driver;
		WebElement btn = driver.findElement(By.className("_8esn"));

		File src = btn.getScreenshotAs(OutputType.FILE);

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss");
		String generateTime = df.format(new Date()) + ".png";

//		File dest = new File("./ErrorShots/ss.png");
		File dest = new File("./ErrorShots/" + generateTime);

		Files.copy(src, dest);
	}

}
