package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		WebElement Slider = driver.findElement(By.xpath("//SPAN[@tabindex='0']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Slider).dragAndDropBy(Slider, 100, 0).build().perform();
		
		
		driver.close();
		
		

	}

}
