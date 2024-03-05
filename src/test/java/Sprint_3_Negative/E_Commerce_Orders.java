package Sprint_3_Negative;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Orders {
	
	WebDriverUtility w = new WebDriverUtility();
	
	//66TC
	
	@Test
	
	public void ordersToAndFromDate()throws Exception
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
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
        
        WebElement SearchDateEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        SearchDateEdt.sendKeys("3/5/2024 - 3/22/2024");
        
        if (SearchDateEdt.isDisplayed()) 
        {
			w.takeScreenShot(driver, "ordersToAndFromDate");
			Thread.sleep(7000);
			driver.quit();
			
		}
        else 
        {
            System.out.println("Orders Are Available");
		}
		
	}
	
	//67TC
	
	@Test
	
	public void ordersEnteringInvalidMobileNumber()throws Exception
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
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
		
        WebElement SearchDateEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        SearchDateEdt.sendKeys("'9666441040");
        
        if (SearchDateEdt.isDisplayed()) 
        {
			w.takeScreenShot(driver, "ordersEnteringInvalidMobileNumber");
			Thread.sleep(7000);
			driver.quit();
			
		}
        else 
        {
            System.out.println("Orders Are Available");
		}
		
        driver.quit();
        
	}
	
	//68TC
	
	@Test
	
	public void ordersEnteringInFilterOption()throws Exception
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
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[@class='btn btn-filter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Start date']")).sendKeys("22/02/2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='End date']")).sendKeys("25/02/2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c12-3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Order Accepted']")).click();
        Thread.sleep(2000);
        
        WebElement MobileNumberEdt = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
        MobileNumberEdt.sendKeys("9666441040");
        
        if (MobileNumberEdt.isDisplayed()) 
        {
			w.takeScreenShot(driver, "ordersEnteringInFilterOption");
			Thread.sleep(7000);
			driver.quit();
			
		}
        else 
        {
            System.out.println("Orders Are Available");
		}
		
        driver.quit();
		
		
	}
		
	//69
	
	@Test
	
	public void ordersViewButton() throws Exception
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
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
        
        Actions act = new Actions(driver);
        act.moveByOffset(200, 0).perform();
        
        //act.moveToElement(WeightEle).perform();
        Thread.sleep(2000);
        
        Robot s = new Robot();
        
        s.keyPress(KeyEvent.VK_PAGE_DOWN);
        s.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        WebElement ViewBtn = driver.findElement(By.xpath("//td[.='Mar 4, 2024']/..//td[.='862']/..//td[.='DASARI JAGADEESH']/..//td[.='916304917977']/..//td//button[@class='btn-sm btn-danger btn-view mr-2 position-relative']"));
        Thread.sleep(2000);
        
        if (ViewBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "ordersViewButton");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			
		} 
        else 
        {
             System.out.println("View is Not Displaying");
		}
		
		driver.quit();
		
	}
	
	//70TC
	
	@Test
	
	public void ordersStatusButton()throws Exception
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
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
        
        Actions act = new Actions(driver);
        act.moveByOffset(200, 0).perform();
        
        //act.moveToElement(WeightEle).perform();
        Thread.sleep(2000);
        
        Robot s = new Robot();
        
        s.keyPress(KeyEvent.VK_PAGE_DOWN);
        s.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        WebElement ViewBtn = driver.findElement(By.xpath("//td[.='Mar 4, 2024']/..//td[.='862']/..//td[.='DASARI JAGADEESH']/..//td[.='916304917977']/..//td//button[@class='btn-sm btn-edit mr-2']"));
        Thread.sleep(2000);
        
        if (ViewBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "ordersViewButton");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			
		} 
        else 
        {
             System.out.println("View is Not Displaying");
		}
		
		driver.quit();
		
	}
}


