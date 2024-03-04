
package Sprint_3_Negative;

import static org.testng.Assert.fail;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.v116CdpInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Categories {
   
	WebDriverUtility w = new WebDriverUtility();
	
	//1TC
	
	@Test
	
	public void loginInvalidCredentials()throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("goldbox@gmail.com",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldbox@2023");
        Thread.sleep(3000);
        w.takeScreenShot(driver, "loginWithInvalidPasswsord");
        Thread.sleep(3000);
        driver.quit();
        
		
	}
	
	//2TC
	
	@Test
	
	public void loginToApplicationWithInvalidCredentials()throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
        Thread.sleep(3000);
        WebElement Signin = driver.findElement(By.xpath("//button[.=' Sign In ']"));
        Thread.sleep(3000);
                if (Signin.isDisplayed())
        {
        	
        	w.takeScreenShot(driver, "loginToApplicationWithInvalidCredentials");
        	Thread.sleep(3000);
        	
		}
        else 
        {
        	System.out.println("Dashboard is Displayed");
			Thread.sleep(3000);
            
		}
		
	    driver.quit();
		
	}
	
	//3TC
	
	@Test
	
     public void e_CommerceModuleE_CommerceDrpDwn()throws Exception
     {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(3000);
        WebElement Category = driver.findElement(By.xpath("//a[.='Category']"));
        Thread.sleep(3000);
        
        if (Category.isDisplayed()) 
        {
			w.takeScreenShot(driver, "e_CommerceModuleE_CommerceDrpDwn");
			Thread.sleep(3000);
			Assert.fail();
			Thread.sleep(3000);
			
		} 
        else 
        {
            System.out.println("Ecommerce is not Dropping Elements");
		}
        
        driver.quit();
     }
	
	//4TC
	
	@Test
	
	public void categoriesModule()throws Exception
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
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(7000);
        WebElement AddCategory = driver.findElement(By.xpath("//button[.='Add Category']"));
        Thread.sleep(3000);
        
        if (AddCategory.isDisplayed()) 
        {
			 w.takeScreenShot(driver,"categoriesModule" );
			 Thread.sleep(3000);
			 Assert.fail();
			 
		} 
        else 
        {
             System.out.println("Categories are Displayed");
		}
        
		driver.quit();
		
	}
	
	//5TC
	
	@Test
	
	public void searchEditFeildCategoryName()throws Exception
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
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(7000);
        WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		
        SearchEdt.sendKeys("StoneJewllery");
        
        Thread.sleep(3000);
        w.takeScreenShot(driver, "searchEditFeildCategoryName");
        Thread.sleep(3000);
        driver.quit();
		
	}
	
	//6TC
	
	@Test 
	
	public void addCategoryPage()throws Exception
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
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(7000);
        WebElement CategoryPage = driver.findElement(By.xpath("//button[.='Add Category']"));
        Thread.sleep(7000);
        
        if (CategoryPage.isDisplayed()) 
        {
			
        	w.takeScreenShot(driver,"addCategoryPage" );
        	Thread.sleep(7000);
        	Assert.fail();
        	
		} 
        else
        {
            System.out.println("Category Page is Displayed");
		}
		
		driver.quit();
		
	}
	
	//7TC
	
	@Test
	
	public void addingCategoryByNullValues()throws Exception
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
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(7000);
        WebElement CategoryPage = driver.findElement(By.xpath("//button[.='Add']"));
        
        if (CategoryPage.isDisplayed()) 
        {
			
        	w.takeScreenShot(driver,"addingCategoryByNullValues" );
        	Thread.sleep(7000);
        	Assert.fail();
        	
		} 
        else
        {
            System.out.println("Category Page is Displayed");
		}
		
		driver.quit();
		
	}
	
	//8TC
	
	@Test
	
	public void onlyAddingOneCategory()throws Exception
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
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='Enter Category Name']")).sendKeys("Bangles");
        Thread.sleep(7000);
        WebElement AddCategory = driver.findElement(By.xpath("//button[.='Add']"));
        
        if (AddCategory.isDisplayed())
        {
			w.takeScreenShot(driver, "onlyAddingOneCategory");
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
           
        	System.out.println("Category Added Successfully");
        	
		}
		  
	}
	
	//9TC
	
	@Test
	
	public void onlyAddingCategoryImage()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(3000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
	    WebElement ChooseFileBtn = driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='No File Chosen'])[1]"));
		
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
        WebElement AddBtn = driver.findElement(By.xpath("//button[.='Add']"));
        
        if (AddBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "onlyAddingCategoryImage");
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
           
        	System.out.println("Category Added Successfully");
        	
		}
		
	}
	
	//10TC
	
	@Test
	
	public void categoryPageShouldNotClose()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(3000);
        WebElement CloseBtn = driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]"));
        Thread.sleep(3000);

        if (CloseBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "categoryPageShouldNotClose");
			Thread.sleep(3000);
			Assert.fail();
			Thread.sleep(3000);
		} 
        else 
        {
            System.out.println("Category Page is Closed");
		}
        
		driver.quit();
		
	}
	
	//11TC
	
	@Test
	
	public void categoryEditButton()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(3000);
        WebElement UpdatePage = driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']"));
        Thread.sleep(3000);
        
		if (UpdatePage.isDisplayed()) 
		{
			w.takeScreenShot(driver, "categoryEditButton");
			Thread.sleep(3000);
			Assert.fail();
			Thread.sleep(3000);
			
		} 
		else 
		{
            System.out.println("Category Update Page is Opned");
		}
		
		driver.quit();
		
	}
	
	//12TC
	
	@Test
	
	public void updatingCategoryByGivingOnlyImage()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(3000);
        WebElement UpdatePage = driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']"));
       
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
		
        WebElement ChooseFileBtn = driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='No File Chosen'])[2]"));
		
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
		
        WebElement UpdateBtn = driver.findElement(By.xpath("//h1[@class='modal-title fs-5']/../following-sibling::div//button[.='Update']"));
       
        if (UpdateBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "updatingCategoryByGivingOnlyImage");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
           
        	System.out.println("Category Updated Successfully");
        	
		}
        
	}
        
        //13TC
        
        @Test
        
         public void updateCategoryCloseButton()throws Exception
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
            Thread.sleep(7000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']")).click();
            Thread.sleep(3000);
            WebElement CloseBtn = driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/..//button[@aria-label='Close'])[2]"));
            
            if (CloseBtn.isDisplayed()) 
            {
				w.takeScreenShot(driver, "updateCategoryCloseButton");
				Thread.sleep(3000);
				Assert.fail();
				
			} 
            else 
            {
                System.out.println("Updtaed Successfully");
			}
            
            driver.quit();
           
	}
        
        //14TC
        
        @Test
        
        public void categoriesBootStrapButton()throws Exception
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
            Thread.sleep(7000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(3000);
            WebElement BootStrapBtn = driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']/..//div//div[@class='mdc-switch__icons']"));
            Thread.sleep(3000);
        	
            if (BootStrapBtn.isDisplayed()) 
            {
				w.takeScreenShot(driver, "categoriesBootStrapButton");
				Thread.sleep(3000);
	        	Assert.fail();
	        	Thread.sleep(3000);
				
			} 
            else 
            {
                System.out.println("Updated Successfylly");
			}
        	
        	
        }
        
        //15TC
        
        @Test
        
        public void categoriesDeletepButton()throws Exception
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
            Thread.sleep(7000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(3000);
            WebElement BootStrapBtn = driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']"));
            Thread.sleep(3000);
        	
            if (BootStrapBtn.isDisplayed()) 
            {
				w.takeScreenShot(driver, "categoriesDeletepButton");
				Thread.sleep(3000);
				Assert.fail();
				Thread.sleep(3000);
				driver.quit();
				
			} 
            else
            {
             System.out.println("Deleted Successfully");
			}
        	
        }
  
        
}
