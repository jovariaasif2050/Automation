package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		
		WebDriver chromeDriver = new ChromeDriver();
		
		String baseURL = "https://youtube.com";
		chromeDriver.get(baseURL);
		
		WebElement searchInput = chromeDriver.findElement(By.xpath("//input[@autocapitalize='none'])"));
				searchInput.sendKeys("funny videos");
				

		WebElement searchButton = chromeDriver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		searchButton.click();
				
			chromeDriver.close();
			
	}

}
