package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConecept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.whiteboxqa.com/");
		System.out.println(driver.getTitle());
		
	    Thread.sleep(2000);

		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
