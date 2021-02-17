package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverConcept {
	
	//moveToElement()

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.whiteboxqa.com/");
		
		System.out.println(driver.getTitle());
		
		Actions act = new Actions(driver);
		
		
	            WebElement resc = driver.findElement(By.xpath("(//A[@href='#'])[2]"));
	            WebElement presc = driver.findElement(By.xpath("//A[@href='presentations.php']"));
	            
		
               act.moveToElement(resc).build().perform(); //mouse over action
               
               act.moveToElement(presc).click().build().perform(); //mouse over and click
               
              System.out.println(driver.getTitle());
               
               driver.close();
               
	}

}
