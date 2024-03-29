package Sprint_3_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Transactions {
	
	WebDriverUtility w = new WebDriverUtility();
	
	//71TC
	
	@Test
	
	public void transactionsSearchFeildName()throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Ecom-Transactions']")).click();
        Thread.sleep(2000);
        
        WebElement SearchBtn = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        SearchBtn.sendKeys("karthik");
        
        if (SearchBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "transactionsSearchFeildName");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Searched Successfully");
		}
		
		driver.quit();
        
	}
	
	//72TC
	
	@Test
	
	public void transactionsSearchFeildUnregisteredNumber()throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Ecom-Transactions']")).click();
        Thread.sleep(2000);
        
        WebElement SearchBtn = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        SearchBtn.sendKeys("9666441040");
        
        if (SearchBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "transactionsSearchFeildUnregisteredNumber");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Searched Successfully");
		}
		
		driver.quit();
	}

}
