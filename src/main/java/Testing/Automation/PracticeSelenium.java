package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.groupninemedia.com/");
		
	//	driver.manage().window().maximize();
		
		Actions brands = new Actions(driver);
		WebElement menu = driver.findElement(By.id("desktop--inline"));
		brands.moveToElement(menu).build().perform();
		Thread.sleep(500);
		WebElement submenu = driver.findElement(By.id("nav__item-link nav__item-link--branding nav__item-link--brand-thrillist"));
		brands.moveToElement(submenu).build().perform();
		Thread.sleep(500);
		
		
		
		
		
		
		
		
	}

}
