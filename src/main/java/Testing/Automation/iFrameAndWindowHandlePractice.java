package Testing.Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameAndWindowHandlePractice {

	public static void main(String[] args) throws InterruptedException {
		
	//setting property
	System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
	
	// creating driver object	
	WebDriver driver = new ChromeDriver();
		
	//open webpage and wait until it loads
	driver.get("http://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	
	WebElement clickButton = driver.findElement(By.xpath("//p//a"));
	clickButton.click();
	
	String parentHandle = driver.getWindowHandle();
	Set<String> allHandles = driver.getWindowHandles();
	System.out.println(allHandles.size());
	
	for (String win : allHandles) {
		System.out.println(win);
		if (!win.contentEquals(parentHandle)) {
			driver.switchTo().window(win);
			driver.close();
		}
	}
	
	driver.switchTo().window(parentHandle);
//	driver.findElement(By.xpath(""));
	
	WebElement email=driver.findElement(By.name("emailid"));
	email.sendKeys("hello@gmail.com");
	
	
	driver.findElement(By.name("btnLogin")).click();
	
	Thread.sleep(2000);
	driver.quit();
	
			
	
	
	
	

	

		
	}

}
