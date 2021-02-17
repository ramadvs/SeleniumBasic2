package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);

		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
