package Sprint_3_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Sub_Categories{
	
	WebDriverUtility w = new WebDriverUtility();
	
	//16TC
	
	@Test
	
	public void subcategories()throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(7000);
        WebElement SubCategoryBtn = driver.findElement(By.xpath("//a[.='Sub Category']"));
        Thread.sleep(7000);
        
        if (SubCategoryBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "subcategories");
			Thread.sleep(7000);
			Assert.fail();
			
		} 
        else
        {
            System.out.println("Subcategories page is displayed");
		}
		
		driver.quit();
		
	}
	
	//17TC
	
	@Test
	
	public void searchEditFeildSubCategory() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(7000);
        WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		
        SearchEdt.sendKeys("StoneJewllery");
        
        Thread.sleep(3000);
        w.takeScreenShot(driver, "searchEditFeildSubCategory");
        Thread.sleep(3000);
        driver.quit();
		
	}
	
	//18TC
	

	
	
}
