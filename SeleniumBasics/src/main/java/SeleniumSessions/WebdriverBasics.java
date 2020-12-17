package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\FirefoxGeckoDriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		
		String title1 = driver.getCurrentUrl();
		
		System.out.println(title);
		
		
		
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		else 
		{
			System.out.println("Incorrect title");
		}

	driver.close();
	
	//driver.quit();

	}

}
