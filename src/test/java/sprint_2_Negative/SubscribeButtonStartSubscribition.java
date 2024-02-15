package sprint_2_Negative;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubscribeButtonStartSubscribition {
	
	//USER END
	
	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	
	public void subscribeButtonStartSubscribition()throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
	    driver.get("http://stg.goldbox.gold/login");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698" , Keys.ENTER);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//h4[.='GOLD PLUS PLAN']/..//button[.='Subscribe']")).click();
	    Thread.sleep(3000);
	    WebElement ErrorMessage = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-sub']"));
	    Thread.sleep(3000);
	    
	    if (ErrorMessage.isDisplayed())
	    {
			w.takeScreenShot(driver, "subscribeButtonStartSubscribition");
			Thread.sleep(3000);
		} 
	    else 
	    {
            System.out.println("Subscribition Added Successfully");
		}
		
		driver.quit();
		
	}

}
