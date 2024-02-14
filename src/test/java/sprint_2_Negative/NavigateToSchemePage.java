package sprint_2_Negative;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateToSchemePage {
	
	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	
	public void schemeNavigation()throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath(" //span[.='Schemes']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Scheme List']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//h6[@class='btn btn-added']")).click();
        
        WebElement AddSchemePage = driver.findElement(By.xpath("//h1[.='Add Scheme']"));
        
        if (AddSchemePage.isDisplayed()) 
        {
        	w.takeScreenShot(driver,"schemeNavigation" );
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
        }
		else
        {
			System.out.println("Add Scheme is not displayed");
	    }
      
        driver.quit();
        
	}

}
