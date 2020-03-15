package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFormHomework {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");	
		
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		firstName.sendKeys("Jovaria");
	
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys("Asif");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("(347)584-3268");

		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("jovariaasif2050@gmail.com");
		
		WebElement address = driver.findElement(By.xpath("//*[contains(@name, 'address1')]"));
		address.sendKeys("85-32 143rd Street");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Jamaica");
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("New York");
		
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("11427");
		
		WebElement dropdown=driver.findElement(By.name("country"));
		Select country= new Select(dropdown);
		country.selectByVisibleText("UNITED STATES");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("jovariaasif");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("whatever");
		
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("whatever");
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		// close the pop-up
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
	
		WebElement message = driver.findElement(By.xpath("//table[@width='492']//font"));
		Boolean messageDisplayed = message.isDisplayed();
		System.out.println(messageDisplayed);
		String actualMessage = message.getText().trim().replaceAll("\\n+", " ");
		
		System.out.println(actualMessage);
		
		String expectedMessage = "Dear" + firstName + " " + lastName + " Thank you for registering. You may now sign-in using the user name and password you've just entered."
				+ "Note: Your username is " + username + ".";
		
		System.out.println("     ");
		System.out.println(expectedMessage);
		
		if (actualMessage.contains(expectedMessage)) {
			System.out.println("Message is displayed correctly.");
		}
		else {
			System.out.println("It doesn't contain the expected message");
		}
		
		
		driver.close();
		
	}

}
