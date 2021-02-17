package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");   
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement EMAIL = driver.findElement(By.id("email"));
		
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOf(EMAIL));
		
		EMAIL.sendKeys("abc@gmail.com");
		
        
		
		
		
		
		

	}

}
