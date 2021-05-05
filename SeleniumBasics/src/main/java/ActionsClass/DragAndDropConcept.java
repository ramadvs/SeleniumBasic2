package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		//adding comment1
		
		//Adding comment numer2
		
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Source1= driver.findElement(By.id("box1"));
		WebElement Target1 = driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);

		act.clickAndHold(Source1).moveToElement(Target1).release().build().perform();
		
		//act.dragAndDrop(Source1,Target1 ).build().perform(); 
		
		driver.close();
	}

}
