package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        		
		driver.get("http://Whiteboxqa.com/");
		
		 //take ScreenShot and store as a file format
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 //Now copy the screenshot to desired location using copy file method
		 
		 FileUtils.copyFile(src, new File("C:\\Users\\rsunk\\git\\SelenumBasics\\SeleniumBasics\\images\\screenshots.png"));

         driver.close();
		
		
	}

}
