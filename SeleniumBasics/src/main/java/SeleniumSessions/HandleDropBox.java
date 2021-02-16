package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://whiteboxqa.com/");
		
		driver.manage().window().maximize();
						
		Select select = new Select(driver.findElement(By.xpath("(//A[@href='#'])[2]")));

		select.selectByVisibleText("recordings");
		
		
		
		

	}

}
