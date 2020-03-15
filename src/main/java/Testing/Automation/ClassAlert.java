package Testing.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		
		driver.findElement(By.id("cookie_action_close_header")).click();
		
		driver.findElement(By.xpath("//div[@id='content']/p[3]/button")).click();
		
	
		
		Alert toolAlert = driver.switchTo().alert();
		toolAlert.accept();
	
		
	
		
		
		driver.close();
		

	}

}
