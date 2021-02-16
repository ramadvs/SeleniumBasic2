package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		 
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\rsunk\\git\\SelenumBasics\\SeleniumBasics\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String URL = prop.getProperty("url");
		
		System.out.println(URL);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");			
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\FirefoxGeckoDriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");			
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.xpath(prop.getProperty("xpath_search_btn"))).sendKeys(prop.getProperty("search_text"));
		
		
		driver.close();

	}

}
