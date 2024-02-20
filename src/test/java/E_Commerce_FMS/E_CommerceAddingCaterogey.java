package E_Commerce_FMS;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CommerceAddingCaterogey {
	
	JavaUtility jUtil = new JavaUtility();
	
	String Bangles = "Bangles"+jUtil.getRandomNum();
	
	@Test
	public void eCommerceAddingCaterogey() throws Exception 
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
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add Category']/../following-sibling::div//input[@placeholder='Enter Category Name']")).sendKeys(Bangles);
        Thread.sleep(3000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Category']/../following-sibling::div//input[@formcontrolname='image']"));
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
        
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(3000);
        driver.quit();
        
	}
	
	
	@Test
	
	public void edit()throws Exception
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
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[.='Bangles2216121']/..//td//img[@class='table-img']/../../td//button[.=' Edit ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Update Category']/../following-sibling::div//input[@placeholder='Enter Category Name']")).sendKeys("Bangglless");
        Thread.sleep(3000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
		WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Update Category']/../following-sibling::div//input[@placeholder='Enter Category Name']/../following-sibling::div//input[@formcontrolname='image']"));
		Thread.sleep(3000);
		
		WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\admin\\Pictures\\Saved Pictures\\Ring.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
		
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Update Category']/../following-sibling::div//input[@placeholder='Enter Category Name']/../following-sibling::div//input[@formcontrolname='image']/../../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(3000);
        driver.quit();
		
	}
	
	  @Test
	  
	  public void bootStrapButton() throws Exception
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
	        Thread.sleep(9000);
	        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[.='Category']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//td[.='Bangles2216121Bangglless']/../td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//button[@class='mdc-switch mdc-switch--selected mdc-switch--checked']")).click();
	        Thread.sleep(3000);
	        driver.quit();
		  
		  
	  }
	
	  @Test
	  
	  public void delete() throws Exception
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
	        Thread.sleep(9000);
	        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[.='Category']")).click();
	        Thread.sleep(3000);
		    driver.findElement(By.xpath("//td[.='Bangles5240134Bangglless']/../td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//button[@class='mdc-switch mdc-switch--selected mdc-switch--checked']/../../..//button[@class='btn-sm btn-edit bg-danger']")).click();
		    Thread.sleep(3000);
		    driver.quit();
		  
	  }
 }

