package Testing.Automation;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebdriver {

	    public static void main(String[] args) {
	   
		System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
		System.setProperty("webdriver.gecko.driver","/Users/jovaaaa3/Documents/Selinium Driver/geckodriver");
			
		WebDriver chromeDriver = new ChromeDriver();
		WebDriver firefoxDriver = new FirefoxDriver();
			
			String baseUrl = "https://linkedin.com";
	        String expectedTitle = "Linkedin";
	        String actualTitle = "";
	    	
	        chromeDriver.get(baseUrl);
	        actualTitle = chromeDriver.getTitle();
	      
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	        chromeDriver.close();
	      
	        firefoxDriver.get("www.linkedin.com");
	        actualTitle = firefoxDriver.getTitle();
	        
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	        firefoxDriver.close();
	        
	    }
	}