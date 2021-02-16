package RealTimeInterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksFromWebPage {
	
	// ABBOTT labs - HCL - round 2 - 2/4/2021
	//How many links are present on a web page
	

	public static void main(String args[]) {
		
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get the number of links present on the page
		//get the name of the links
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		
		System.out.println(linkslist.size());	
		
		for(WebElement link: linkslist) {
		System.out.println(link.getText() + " - " +link.getAttribute("href"));
	     }
		
		
		driver.close();
		
	}

		
		
	}

