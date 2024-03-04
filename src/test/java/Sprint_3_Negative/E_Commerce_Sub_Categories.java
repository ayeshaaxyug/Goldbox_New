package Sprint_3_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
        Thread.sleep(5000);
        WebElement SubCategoryBtn = driver.findElement(By.xpath("//a[.='Sub Category']"));
        Thread.sleep(5000);
        
        if (SubCategoryBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "subcategories");
			Thread.sleep(5000);
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		
        SearchEdt.sendKeys("StoneJewllery");
        
        Thread.sleep(3000);
        w.takeScreenShot(driver, "searchEditFeildSubCategory");
        Thread.sleep(3000);
        driver.quit();
		
	}
	
	//18TC
	
	@Test 
	
	public void addingSubCategoryNull() throws Exception
	
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(5000);
        WebElement Subcategory = driver.findElement(By.xpath("//button[.='Add']"));
        Thread.sleep(5000);
        
        if (Subcategory.isDisplayed())
        {
			w.takeScreenShot(driver,"addingSubCategoryNull" );
			Thread.sleep(5000);
			driver.quit();
		} 
        else 
        {
            System.out.println("Added SubCategory Successfully");
		}
  
	driver.quit();	
		
	}

	//19TC
	
	@Test
	
	public void addingSubCategoryCategoryOnly()throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(5000);
        
        WebElement SubCategoryCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//select[@placeholder='Select Category']"));

        // Create a Select object from the dropdown element
        Select SubCategoryCategoryNameDrpDwn = new Select(SubCategoryCategoryNameyDrpDwnElement);

        // Select an option by visible text
        SubCategoryCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        WebElement Subcategory = driver.findElement(By.xpath("//button[.='Add']"));
        Thread.sleep(5000);
        
        if (Subcategory.isDisplayed())
        {
			w.takeScreenShot(driver,"addingSubCategoryCategoryOnly" );
			Thread.sleep(5000);
			driver.quit();
		} 
        else 
        {
            System.out.println("Added SubCategory Successfully");
		}
  
	//driver.quit();
        
	}
	
	//20TC
	
	@Test
	
	public void subCategory2Values()throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(5000);
        
        WebElement SubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//select[@placeholder='Select Category']"));

        // Create a Select object from the dropdown element
        Select SubCategoryNameDrpDwn = new Select(SubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        SubCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).sendKeys("Flower Bangles");
        Thread.sleep(5000);
        
        WebElement Subcategory = driver.findElement(By.xpath("//button[.='Add']"));
        Thread.sleep(5000);
        
        if (Subcategory.isDisplayed())
        {
			w.takeScreenShot(driver,"subCategory2Values" );
			Thread.sleep(5000);
			driver.quit();
		} 
        else 
        {
            System.out.println("Added SubCategory Successfully");
		}
  
          driver.quit();
        
	}

	//21TC
	
	@Test
	
	public void SubCategoryEditButton()throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        
        WebElement EditButton = driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']"));
        Thread.sleep(5000);
        
        if (EditButton.isDisplayed())
        {
			w.takeScreenShot(driver, "SubCategoryEditButton");
			Thread.sleep(5000);
			driver.quit();
		} 
        else 
        {
           System.out.println("Update Page is Opened Successfully");
		}
        
        driver.quit();
        
	}
	
	//22TC
	
	@Test
	
	public void updatingWithoutPassingDetails() throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']")).click();
        Thread.sleep(5000);
        
        WebElement Update = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']"));
        
        if (Update.isDisplayed())
        {
			w.takeScreenShot(driver, "updatingWithoutPassingDetails");
			Thread.sleep(5000);
			driver.quit();
		} 
        else 
        {
           System.out.println("Update Page is Opened Successfully");
		}
        
        driver.quit();
        
	}
	
	//23TC
	
	@Test
	
	public void updatingByGivingOnlyCategoryName()throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']")).click();
        Thread.sleep(5000);
        
        WebElement UpdateSubCategoryCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-valid']"));

        // Create a Select object from the dropdown element
        Select UpdateSubCategoryNameDrpDwn = new Select(UpdateSubCategoryCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateSubCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(5000);
        WebElement Updtae = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']"));
        Thread.sleep(5000);
        
        if (Updtae.isDisplayed()) 
        {
			w.takeScreenShot(driver, "updatingByGivingOnlyCategoryName");
			Thread.sleep(5000);
			driver.quit();
			
		} 
        else 
        {
             System.out.println("Update Successfully");
		}
       
        driver.quit();
		
	}
	
	//24TC
	
	@Test
	
	public void updatingSubCategoryByPassing2Values()throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']")).click();
        Thread.sleep(5000);
        
        WebElement UpdateSubCategoryCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-valid']"));

        // Create a Select object from the dropdown element
        Select UpdateSubCategoryNameDrpDwn = new Select(UpdateSubCategoryCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateSubCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).sendKeys("Gold Bangles");
        Thread.sleep(5000);
        WebElement Updtae = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']"));
        Thread.sleep(5000);
        
        if (Updtae.isDisplayed()) 
        {
			w.takeScreenShot(driver, "updatingSubCategoryByPassing2Values");
			Thread.sleep(5000);
			driver.quit();
			
		} 
        else 
        {
             System.out.println("Update Successfully");
		}
       
        driver.quit();
        
	}
	
	//25TC
	
	@Test
	
	public void subCategoryBootStrapButton() throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        
        WebElement BootStrapButton = driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']/..//div[@class='mdc-form-field']"));
        Thread.sleep(5000);
        
        if (BootStrapButton.isDisplayed()) 
        {
			w.takeScreenShot(driver, "subCategoryBootStrapButton");
			Thread.sleep(5000);
			driver.quit();
			
		} 
        else 
        {
            System.out.println("Switched On Successfully");
            
		}
        
		driver.quit();
		
	}
	
	//26TC
	
	@Test
	
	public void subCategoryDeleteButton()throws Exception{
		
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        
        WebElement DeleteButton = driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']"));
        Thread.sleep(5000);
        
        if (DeleteButton.isDisplayed()) 
        {
			w.takeScreenShot(driver, "subCategoryDeleteButton");
			Thread.sleep(5000);
			driver.quit();
			
		} 
        else 
        {
            System.out.println("Switched On Successfully");
            
		}
        
		driver.quit();
		
	}
	
	//27TC
	
	@Test
	
	public void closingSubCategoryPage()throws Exception
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(5000);
        
        WebElement CloseButton = driver.findElement(By.xpath("//h1[.='Add SubCategory']/..//button[@aria-label='Close']"));
        Thread.sleep(5000);
        if (CloseButton.isDisplayed()) 
        {
			w.takeScreenShot(driver, "closingSubCategoryPage");
			Thread.sleep(5000);
			driver.quit();
			
		} 
        else 
        {
            System.out.println("Closed Successfully");
            
		}
        
       driver.quit();
        
	}
}