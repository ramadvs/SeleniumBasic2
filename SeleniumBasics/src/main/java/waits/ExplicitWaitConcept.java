package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	public static void clickOn(WebDriver driver, WebElement webelem, int timeout) {
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class )
		.until(ExpectedConditions.visibilityOf(webelem));
		
		webelem.sendKeys("abc@gmail.com");
		
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
	 clickOn(driver, driver.findElement(By.id("email")),10);
		
		

	}

}
