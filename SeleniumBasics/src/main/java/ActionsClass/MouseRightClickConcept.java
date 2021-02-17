package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickConcept {
	
	//contextClick()

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.whiteboxqa.com/");
		
		Actions act = new Actions(driver);
		
		 WebElement resc = driver.findElement(By.xpath("(//A[@href='#'])[2]"));
		 
		 act.contextClick(resc).build().perform();//right click the element.
		 
		 Thread.sleep(5000);
		 
		driver.close();
	}

}
