package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radioBox = driver.findElement(By.id("vfb-7-1"));
		radioBox.click();
		
		//to see if the radio box is selected or not
		System.out.println(radioBox.isSelected());
		
		Thread.sleep(1000);
	
		
		//check the box
		WebElement checkBoxOne = driver.findElement(By.id("vfb-6-0"));
		checkBoxOne.click();
	
		if (checkBoxOne.isSelected()) {
			System.out.println("is selected"); 
		}
		else {
			System.out.println("is not selected"); 
		}
			
		
		if (checkBoxOne.isSelected()) {
			checkBoxOne.click();
		}
		
		checkBoxOne.isDisplayed();
		checkBoxOne.isEnabled();
		checkBoxOne.isSelected();
		
		// ^ know the difference and what's the functionality and how it can be tested
		
		
		
		
		
		
		WebElement checkBoxTwo = driver.findElement(By.id("vfb-6-1"));
		checkBoxTwo.click();
		
		WebElement checkBoxThree = driver.findElement(By.id("vfb-6-2"));
		checkBoxThree.click();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
