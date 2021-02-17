package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");   
		WebDriver  driver = new ChromeDriver();
		
		 driver.get("http://whiteboxqa.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 	 
//		driver.close();

	}

}
