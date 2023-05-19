package Expedea.expedea;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class ExpediaTest {
	
	public WebDriver driver;
	
	
	
  @BeforeMethod
  public void beforeMethod() {
	  
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\asimf\\eclipse-workspace\\expedea\\driver\\geckodriver.exe");
    	
  }
  
  @Test
  public void findflight() throws InterruptedException {
	  
	  driver = new FirefoxDriver();
	  
      driver.get("https://www.expedia.com");
      Thread.sleep(5000);
      
      
      WebElement flightTab = driver.findElement(By.cssSelector("li.uitk-tab a[aria-controls='wizard-flight-pwa']"));
      flightTab.click();
      
      Thread.sleep(5000);
      
      WebElement leavingFromButton = driver.findElement(By.cssSelector("button[aria-label='Leaving from']"));
      leavingFromButton.click();
      
      Thread.sleep(1000);
      
      WebElement leavingFromLocation = driver.findElement(By.id("location-field-leg1-origin"));
      leavingFromLocation.sendKeys("Berlin");
      Thread.sleep(5000);
      
      WebElement leavingFromLocationButton = driver.findElement(By.cssSelector("button[aria-label='Berlin (BER - Brandenburg) Germany']"));
      leavingFromLocationButton.click();
      Thread.sleep(5000);
  }




  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
