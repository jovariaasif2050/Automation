package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		//webelement for dropdown
		WebElement dropdown=driver.findElement(By.name("country"));
		
		Select country=new Select(dropdown);
		country.selectByIndex(0);
		Thread.sleep(3000);
		country.selectByVisibleText("ALGERIA");
		Thread.sleep(3000);
		country.selectByValue("AMERICAN SAMOA");
		Thread.sleep(3000);
		
		WebElement myElement = country.getFirstSelectedOption();
		
		System.out.println(myElement.getText());
		
		driver.close();
}

}
