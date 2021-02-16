package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://whiteboxqa.com/login.php");
		
//		1. xpath
		
		driver.findElement(By.xpath("//INPUT[@id='username']")).sendKeys("abc");
		driver.findElement(By.xpath("//INPUT[@id = 'password']")).sendKeys("xyz");
		Thread.sleep(3000);
		
	    driver.findElement(By.name("submit")).click();
/*
		
//		2. id
		
		driver.get("http://whiteboxqa.com/");		
		Thread.sleep(2000);		
		driver.findElement(By.id("loginButton")).click();
	
		
 //      3. name
		
		driver.get("http://whiteboxqa.com/login.php");
		driver.findElement(By.name("uname")).sendKeys("abcd");
		driver.findElement(By.name("pwd")).sendKeys("xyz");
	
//		4.Linktext
		
		//This is only for links
		driver.get("http://whiteboxqa.com/");	
		driver.findElement(By.linkText("Login")).click();
		
//		5.partial link text - Not useful
		
		driver.get("http://whiteboxqa.com/index.php");
		driver.findElement(By.partialLinkText("info@whitebox")).click();
		
//		6.CSSSelector
		driver.get("http://whiteboxqa.com/login.php");
		driver.findElement(By.cssSelector("#username")).sendKeys("abcd");
		driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		
 //     7.className
		driver.get("http://whiteboxqa.com/index.php");
		driver.findElement(By.className("divider")).click();
		
//	   8. tagName
		
*/		
		
		
	}

}
