package methods_webdriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in-/");
		
//		getCookies() - Set<Cookie>
//		getCookieNamed() - Cookie
//		addCookie() - void
//		deleteCookie() - void
//		deleteNamedCookie() - void
//		deleteAllCookies() - void

		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());

//		for (Cookie cookie : cookies) {
//			System.out.println(cookie.getName());
//		}

		/*
		 * Cookie mid = driver.manage().getCookieNamed("mid"); System.out.println(mid);
		 */

//		Cookie pookie = new Cookie("batch", "A3");
//		driver.manage().addCookie(pookie);
//
//		Set<Cookie> cookies1 = driver.manage().getCookies();
//		System.out.println(cookies1.size());
//		for (Cookie cookie : cookies1) {
//			System.out.println(cookie.getName());
//		}
//		driver.quit();

//		driver.manage().deleteAllCookies();
//		Set<Cookie> cookies2 = driver.manage().getCookies();
//		System.out.println(cookies2.size());
//
//		for (Cookie cookie : cookies2) {
//			System.out.println(cookie.getName());
//		}

	}

}
