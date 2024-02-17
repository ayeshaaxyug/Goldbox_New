package sprint_2_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TenureAddingAmountSuccessfully {
	
	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	
	public void tenureAddingAmountSuccessfully()throws Exception
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
        
        for (int i = 1; i <= 9; i++)
        {
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("//a[text()=' Next ']")).click();
        	 Thread.sleep(3000);
		}
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//td[.='GGOOLLDD']/..//td[.='MY GOLD']/..//button[.=' View ']/../..//td//button[.=' Info '])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys("1000");
        Thread.sleep(3000);
        WebElement TenureAddingAmountSuccessfully = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(3000);
		w.takeScreenShot(driver, "tenureAddingAmountSuccessfully");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
