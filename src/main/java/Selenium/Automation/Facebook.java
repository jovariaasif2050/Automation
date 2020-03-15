package Selenium.Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
   public String baseUrl = "https://www.facebook.com/";
   public WebDriver driver;
   @BeforeTest
   public void launchBrowser() {
      // System.out.println("launching firefox browser");
      System.setProperty("webdriver.chrome.driver","/Users/jovaaaa3/Documents/Selinium Driver/chromedriver");
      driver = new ChromeDriver();
      driver.get(baseUrl);
   }
   @Test
   public void verifyHomepageTitle() {
      String expectedTitle = "Facebook - Log In or Sign Up";
      String actualTitle = driver.getTitle();
      System.out.println(actualTitle);
      Assert.assertEquals(actualTitle, expectedTitle);
   }
   @AfterTest
   public void terminateBrowser() {
      driver.close();
   }
}

