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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CommerceAddingSubCategory {
	
JavaUtility jUtil = new JavaUtility();
	
	String Rings = "Rings"+jUtil.getRandomNum();
	
	@Test
	
	public void eCommerceAddingSubCategory() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("chains",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(3000);
        
        WebElement CategorNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//select[@placeholder='Select Category']"));

        // Create a Select object from the dropdown element
        Select CategoryNameDrpDwn = new Select(CategorNameyDrpDwnElement);

        // Select an option by visible text
        CategoryNameDrpDwn.selectByVisibleText("chains");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).sendKeys("Chainss");
        Thread.sleep(3000);
        
        WebElement SelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-invalid']"));

        // Create a Select object from the dropdown element
        Select SelectTypeDrpDwn = new Select(SelectTypeDrpDwnElement);

        // Select an option by visible text
        SelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(3000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
         WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']/../following-sibling::div//select[@placeholder='Select Type']/../following-sibling::div//input[@placeholder='No File Chosen']"));
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
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("//h1[.='Add SubCategory']/../..//button[.='Add']")).click();
         Thread.sleep(3000);
         driver.quit();
          
	}
	
	@Test
	
	public void edit() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath("//td[.='chains']/..//td[.='Chainss']/..//td[.='Gold']/..//td//button[.=' Edit ']")).click();
		Thread.sleep(3000);
		
		WebElement CategorNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-valid']"));

        // Create a Select object from the dropdown element
        Select CategoryNameDrpDwn = new Select(CategorNameyDrpDwnElement);

        // Select an option by visible text
        CategoryNameDrpDwn.selectByVisibleText("Rings");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).sendKeys("RinggGG");
        Thread.sleep(3000);
        
        WebElement SelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-invalid']"));

        // Create a Select object from the dropdown element
        Select SelectTypeDrpDwn = new Select(SelectTypeDrpDwnElement);

        // Select an option by visible text
        SelectTypeDrpDwn.selectByVisibleText("Silver");
		
        Thread.sleep(3000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
		WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//input[@placeholder='No File Chosen']"));
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
		
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div/button[.='Update']")).click();
        Thread.sleep(3000);
        driver.quit();
        
	}
	
	 @Test
	 
	 public void bootStrapButtom()throws Exception
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
	        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
	        Thread.sleep(3000); 
		    driver.findElement(By.xpath("//td[.='Rings']/..//td[.='ChainssRinggG']/..//td[.='Silver']/..//td//button[.=' Edit ']/..//div[@class='mdc-switch__icons']")).click();
		    Thread.sleep(3000); 
		    driver.quit();
		 
	 }
	
	 @Test
	 
	 public void delete()throws Exception
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
	        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
	        Thread.sleep(3000); 
	        driver.findElement(By.xpath("DELETE OPTION"));
	        
	        
	 }
	  
}
