package Sprint_3_Negative;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Brands {
	
	WebDriverUtility w = new WebDriverUtility();
	
	//59TC
	
	@Test
	
	public void addingBrandsByPassingNullValues()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        
        WebElement AddBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (AddBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "addingBrandsByPassingNullValues");
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
             System.out.println("Brand Added Auccessfully");
		}
        
	       driver.quit();
		
	}
	
	//60TC
	
	@Test
	
	public void addingOnlyBrandName()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='name']")).sendKeys("abc");
        Thread.sleep(2000);
        
        WebElement AddBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (AddBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "addingOnlyBrandName");
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
             System.out.println("Brand Added Auccessfully");
		}
        
	       driver.quit();
		
	}
	
	//61TC
	
	@Test
	
	public void addingOnlyBrandImage()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\admin\\Pictures\\Saved Pictures\\Bangles.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
		
        Thread.sleep(2000);
        WebElement AddBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (AddBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "addingOnlyBrandName");
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
             System.out.println("Brand Added Auccessfully");
		}
        
	       driver.quit();
	
	}
	
	//62TC
	
	@Test
	
	public void brandsSearchFeildPassingValue()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        
        WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        SearchEdt.sendKeys("Matrika");
        
		if (SearchEdt.isDisplayed()) 
		{
			w.takeScreenShot(driver, "searchFeaildPassingValue");
			Thread.sleep(2000);
			driver.quit();
			
		} 
		else
		{
             System.out.println("Search Element Found");
		}
	
		driver.quit();
		
	}
	
	//63TC
	
	@Test
	
	public void brandAddingAndEditingItByRemovingBrandName()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='name']")).sendKeys("abcd");
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(3000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\admin\\Pictures\\Saved Pictures\\Bangles.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
		
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='abc']/..//td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//input[@formcontrolname='name']")).clear();
        Thread.sleep(2000);
        
        WebElement UpdateBtn = driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//button[.='Update']"));
        Thread.sleep(2000);
        
        if (UpdateBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "brandAddingAndEditingItByRemovingBrandName");
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
             System.out.println("Brand Added Auccessfully");
		}
        
	       driver.quit();
		
	}
	
	//65TC
	
	@Test
	
	public void brandsBootStrapButton()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
		
		WebElement BootStrapbtn = driver.findElement(By.xpath("//td[.='abc']/..//td//button[.=' Edit ']/..//div[@class='mdc-switch__ripple']"));
		Thread.sleep(2000);
		
		if (BootStrapbtn.isDisplayed())
		{
			w.takeScreenShot(driver, "brandsBootStrapButton");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			
		} 
		else
		{
            System.out.println("Brand Is Displaying");
		}
		
		driver.quit();
		
	}
}