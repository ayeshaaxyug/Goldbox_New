package sprint_2_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateToDashboard {
	
	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	
	public void navigateToDashboardTest()throws Exception
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='Dashboard']")).click();
        Thread.sleep(3000);
        
        WebElement Schemes = driver.findElement(By.xpath("//a[.='Scheme List']"));
        
        if (Schemes.isDisplayed()) 
        {
        	System.out.println("Schemes List is Displayed");	
		}
        else
		{
            w.takeScreenShot(driver, "navigateToDashboard");
		}
        
        driver.quit();
		
	}

}
