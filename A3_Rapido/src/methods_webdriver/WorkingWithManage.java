package methods_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithManage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.manage().window().maximize();
		 */

		driver.get("https://www.zeptonow.com/");
		
		Window win = driver.manage().window();
		
		win.maximize();
//		win.minimize();
//		win.fullscreen();
		
//		Dimension dim = new Dimension(width, height)
		
		/*
		 * Dimension dim = win.getSize(); int height = dim.getHeight(); int width =
		 * dim.getWidth();
		 * 
		 * win.setSize(new Dimension(200, 200));
		 * 
		 * System.out.println(dim + " " +height + " " + width);
		 */
		
		/*
		 * Point pt2 = new Point(0, 0); Point pt = win.getPosition();
		 * 
		 * System.out.println(win.getPosition());
		 * 
		 * win.setPosition(pt2);
		 */
		
		
		driver.quit();
	}

}
