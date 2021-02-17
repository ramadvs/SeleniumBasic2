package AlertsAndPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("url");
		
		driver.findElement(By.xpath("//input[@id='browsebtn']")).sendKeys("C:\\Rama\\Selenium.txt");
		
		//The html document should contain “type=file” to work with this feature.

	}

}
