package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.groupninemedia.com/careers");
		
		
		// ChromeDriver.findElement(By.className("search__placeholder--search search-input")).click();
		
        
		Actions action = new Actions(chromeDriver);
		action.moveToElement(chromeDriver.findElement(By.className("g9-hero-text__cta-text"))).click().perform();
		
		
		action.moveToElement(chromeDriver.findElement(By.className("current-openings__job-position-title"))).click().perform();
		
		
		Thread.sleep(3000);
		//I know you told us not to use it
		
		chromeDriver.close();
		
	}

}
