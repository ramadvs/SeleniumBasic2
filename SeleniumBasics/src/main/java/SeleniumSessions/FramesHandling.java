package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.half.ebay.com");
		
		driver.switchTo().frame(1);
		
		//driver.switchTo().frame("mainpanel");
		//we can use either frame name or index number
		//To identify if the web page contains “frames”, right click above the web elements. 
		//If the page contains frames, it will show as “This frame” or “view frame source”.
		// If we find “iframe” tag in page source, it indicates frames are present in the web page.
		
		driver.findElement(By.xpath("//input[@id='name']")).click();
		
		

	}

}
