package Testing.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(3000); 
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
        alert.accept();
    
		
        driver.close();
	}
}
