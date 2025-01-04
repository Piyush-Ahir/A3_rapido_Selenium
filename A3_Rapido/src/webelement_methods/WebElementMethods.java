package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(searchField);
		
		driver.navigate().refresh();
		searchField = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(searchField);

		
		searchField.sendKeys("mobile");
		searchField.clear();
		searchField.sendKeys("iPhone");

	
		System.out.println(searchField.getAttribute("name"));
		System.out.println(searchField.getCssValue("font-family"));
		System.out.println(searchField.getTagName());
		
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		
		Dimension dim = searchBtn.getSize();
		int h = dim.getHeight();
		int w = dim.getWidth();
		System.out.println(dim + " " + h + " "  + w);
		
		Point pt = searchBtn.getLocation();
		int x = pt.getX();
		int y = pt.getY();
		System.out.println(pt);
		
		searchBtn.click();

		

	}

}
