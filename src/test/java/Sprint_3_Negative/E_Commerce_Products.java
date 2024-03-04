package Sprint_3_Negative;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Products {
	
	WebDriverUtility w = new WebDriverUtility();
	
	//28TC
	
	@Test
	
	public void productsLink() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsLnk = driver.findElement(By.xpath("//a[.='Products']"));
        Thread.sleep(2000);
        
        if (ProductsLnk.isDisplayed()) 
        {
        	
           w.takeScreenShot(driver, "productsLink");
           Thread.sleep(2000);
           driver.quit();
           
		} 
        else 
		{
             System.out.println("ProductsLnk Page is Successfully Displayed");
		}
        
		driver.quit();
		
	}
	
	//29TC
	
	@Test

	public void searchEditFeildProduct() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        
        WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		
        SearchEdt.sendKeys("Necklace");
        
        if (SearchEdt.isDisplayed())
        {
			w.takeScreenShot(driver, "searchEditFeildProduct");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
            System.out.println("Successfully Searched ");
		}
        
        driver.quit();
        
	}
	
	//30TC
	
	@Test
	
	public void addingProductNull() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement AddingProduct = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (AddingProduct.isDisplayed()) 
        {
			w.takeScreenShot(driver, "addingProductNull");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
            System.out.println("Product added Successfully");
		}
        
      driver.quit();
		
	}
	
	//31TC
	
	@Test
	
	public void productsGivingOnlyCategoryName() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "productsGivingOnlyCategoryName");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
		driver.quit();
        
	}
	
	//32TC
	
	@Test
	
	public void addingProductsByPassing2Values()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing2Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
	}
	
	//33TC
	
	@Test
	
	public void addingProductsByPassing3Values() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing3Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
	}
	
	//34TC
	
	@Test
	
	 public void addingProductsByPassing4Values()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing4Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
	 }
	
	//35TC
	
	@Test
	
	public void addingProductsByPassing5Values() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing5Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
	}
	
	//36TC
	
	@Test
	
	public void addingProductsByPassing6Values() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement ProductsSelectCaratyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratyDrpDwnElement);

        // Select an option by visible text
        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
        Thread.sleep(2000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing6Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
	
	}
	
	//37TC
	
	@Test
	
	public void addingProductsByPassing7Values() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);

        // Select an option by visible text
        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing7Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();

	}
	
	//38TC
	
	@Test
	
	public void addingProductsByPassing8Values()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);

        // Select an option by visible text
        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing8Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
	}
	
	//39TC
	
	@Test
	
	public void addingProductsByPassing9Values() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);

        // Select an option by visible text
        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("15");
        Thread.sleep(2000);
        
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing9Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
	}
	
	//40TC
	
	@Test
	
	public void addingProductsByPassing10Values() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);

        // Select an option by visible text
        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("15");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("20");
        Thread.sleep(2000);
		
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing10Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
	}
	
	//41TC
	
	@Test

	public void addingProductsByPassing11Values() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);

        // Select an option by visible text
        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("15");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("20");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")).sendKeys("Excellent Designed Bangles");
        Thread.sleep(2000);
		
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing11Values");
			Thread.sleep(2000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
	}
	
	//42TC
	
	@Test
	
	public void addingProductsByPassing12Values()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(2000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement ProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratDrpDwnElement);

        // Select an option by visible text
        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
        Thread.sleep(2000);
        
        WebElement ProductsSelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectTypeDrpDwn = new Select(ProductsSelectTypeDrpDwnElement);

        // Select an option by visible text
        ProductsSelectTypeDrpDwn.selectByVisibleText("Gold");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("120000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("15");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("20");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")).sendKeys("Excellent Designed Bangles");
        Thread.sleep(2000);
		
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='image']"));
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
		
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing12Values");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
	
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
	}
	
	//43TC
	
	@Test
	
	public void addProductsPageClose() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(2000);
        
        WebElement CloseBtn = driver.findElement(By.xpath("//h1[.='Add Product Details']/..//button[@aria-label='Close']"));
        Thread.sleep(2000);
        
        if (CloseBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "addProductsPageClose");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
	
		} 
        else 
        {
             System.out.println("Product Page Closed Successfully");
		}
        
        driver.quit();
        
	}
	
	//44TC
	
	@Test
	
	public void productsWeight_SizePage() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        
        WebElement WeightPage = driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']"));
        Thread.sleep(2000);
        
        if (WeightPage.isDisplayed())
        {
			w.takeScreenShot(driver, "productsWeight_SizePage");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			
		} 
        else 
        {
            System.out.println("Weights Page is Displaying");
		}
		
		driver.quit();
		
	}
	
	//45TC
	
	@Test
	
	public void productsWeight_SizePageEditPage()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']")).click();
        Thread.sleep(2000);
        
        WebElement EditBtn = driver.findElement(By.xpath("//td[.='Kp']/..//td[.='10']/..//td[.='20']/..//button[.=' Edit ']"));
        Thread.sleep(2000);
        
        if (EditBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "productsWeight_SizePageEditPage");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			
		} 
        else 
        {
            System.out.println("Weights Page is Displaying");
		}
		
		driver.quit();
		
	}
	
	//46TC
	
	@Test
	
	public void productsWeight_SizePageEditPage_clearingDetails()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Kp']/..//td[.='10']/..//td[.='20']/..//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@placeholder='Enter Product Size']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@placeholder='Enter Product Weight']")).clear();
        Thread.sleep(2000);
        
        WebElement EditBtn = driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//button[.='Update']"));
        Thread.sleep(2000);
     
        if (EditBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "productsWeight_SizePageEditPage_clearingDetails");
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
            System.out.println("Product Size Updated Successfully");
		}
		
		driver.quit();
		
	}
	
	//47TC
	
	@Test
	
	public void productsWeight_SizePageEditPage_Closing() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Kp']/..//td[.='10']/..//td[.='20']/..//button[.=' Edit ']")).click();
        Thread.sleep(2000);
      
        WebElement CloseBtn = driver.findElement(By.xpath("//h1[.='Update Product Sizes']/..//button[@aria-label='Close']"));
        Thread.sleep(2000);
        
        if (CloseBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "productsWeight_SizePageEditPage_Closing");
			Thread.sleep(2000);
			driver.quit();
			
		} 
        else 
        {
            System.out.println("Product Size Page Is Closed Successfully");
		}
		
		driver.quit();
		
	}
	
	//48TC
	
	@Test
	
	public void productsWeight_SizePageEditPage_BootStrapButton() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']")).click();
        Thread.sleep(2000);
		
        WebElement BootStrapBtn = driver.findElement(By.xpath("//td[.='Kp']/..//td[.='10']/..//td[.='20']/..//button[.=' Edit ']/..//div[@class='mdc-form-field']"));
        Thread.sleep(2000);
        
        if (BootStrapBtn.isDisplayed())
        {
			w.takeScreenShot(driver, "productsWeight_SizePageEditPage_BootStrapButton");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			
		}
        else
        {
            System.out.println("Product Size updated Successfully");
		}
        
        driver.quit();
		
	}
	
	//49TC
	
	@Test
	
	public void productsWeight_SizePageEditPage_DeleteButton() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']")).click();
        Thread.sleep(2000);
        
        WebElement DeleteBtn = driver.findElement(By.xpath("//td[.='Kp']/..//td[.='10']/..//td[.='20']/..//button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']"));
        Thread.sleep(2000);
        
        if (DeleteBtn.isDisplayed()) 
        {
			w.takeScreenShot(driver, "productsWeight_SizePageEditPage_DeleteButton");
			Thread.sleep(2000);
			Assert.fail();
			Thread.sleep(2000);
			
		} 
        else 
        {
           System.out.println("Product Deleted Successfully");
		}
		
		driver.quit();
		
	}
	
	//50TC
	
	@Test
	
	public void product_StonePage_Adding_Null() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        
        WebElement AddingProductStone = driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (AddingProductStone.isDisplayed()) 
        {
			w.takeScreenShot(driver, "product_StonePage_Adding_Null");
			Thread.sleep(2000);
			driver.quit();
			
		}
        else 
        {
            System.out.println("Added Successfully");
		}
   
	driver.quit();	
		
	}
	
	//51TC
	
	@Test
	
	public void product_StonePage_Adding_StoneName() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='stonename']")).sendKeys("Diamond");
        Thread.sleep(2000);
        
        WebElement AddingProductStone = driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (AddingProductStone.isDisplayed()) 
        {
			w.takeScreenShot(driver, "product_StonePage_Adding_StoneName");
			Thread.sleep(2000);
			driver.quit();
			
		}
        else 
        {
            System.out.println("Added Successfully");
		}
   
	     driver.quit();	
		
	}
	
	//52TC
	
	@Test
	
	public void product_StonePage_Adding_StoneColour()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='colour']")).sendKeys("White");
        Thread.sleep(2000);
        
        WebElement AddingProductStone = driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (AddingProductStone.isDisplayed()) 
        {
			w.takeScreenShot(driver, "product_StonePage_Adding_StoneColour");
			Thread.sleep(2000);
			driver.quit();
			
		}
        else 
        {
            System.out.println("Added Successfully");
		}
   
	     driver.quit();
		
	}
	
	//53TC
	
	@Test
	
	public void product_StonePage_Adding_StonePrice() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='stoneprice']")).sendKeys("10000");
        Thread.sleep(2000);
        
        WebElement AddingProductStone = driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        if (AddingProductStone.isDisplayed()) 
        {
			w.takeScreenShot(driver, "product_StonePage_Adding_StonePrice");
			Thread.sleep(2000);
			driver.quit();
			
		}
        else 
        {
            System.out.println("Added Successfully");
		}
   
	     driver.quit();
	
	}
	
	//54TC
	
	@Test
	
	public void product_StonePage_Adding_StoneDetails_Successfully() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='stonename']")).sendKeys("Diamond");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='colour']")).sendKeys("White");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='stoneprice']")).sendKeys("10000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='noofstones']")).sendKeys("10");
        Thread.sleep(2000);
        
        WebElement AddingProductStone = driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
	    w.takeScreenShot(driver, "product_StonePage_Adding_StoneDetails_Successfully");
	    Thread.sleep(2000);
	    driver.quit();
		
	}
	
	//55TC
	
	@Test
	
	public void product_StonePage_Adding_StoneDetails_Clearing() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' View '])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Diamond']/..//td[.='White']/..//td[.='₹1,000.00']/..//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='stonename']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='colour']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='stoneprice']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='noofstones']")).clear();
        Thread.sleep(2000);
        
        WebElement AddingProductStone = driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//button[.='Update']"));
        Thread.sleep(2000);
        
	    if (AddingProductStone.isDisplayed())
	    {
			w.takeScreenShot(driver, "product_StonePage_Adding_StoneDetails_Clearing");
			Thread.sleep(2000);
			driver.quit();
		} 
	    else 
	    {
            System.out.println("Stones Details are Not Cleared");
		}
	    
	    driver.quit();
	    
	}
	
	//56TC
	
	@Test
	
	public void productPageActionButton_ClearingData3() throws Exception{
		
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        
        WebElement UpdateProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select UpdateProductsCategoryNameDrpDwn = new Select(UpdateProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateProductsCategoryNameDrpDwn.selectByVisibleText("Select Category");
        
        Thread.sleep(2000);
        
        WebElement UpdateProductsSUbCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select UpdateProductsSubCategoryNameDrpDwn = new Select(UpdateProductsSUbCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateProductsSubCategoryNameDrpDwn.selectByVisibleText("Select SubCategory");
        
        Thread.sleep(2000);

        WebElement UpdateProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select UpdateProductsBrandNameDrpDwn = new Select(UpdateProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        UpdateProductsBrandNameDrpDwn.selectByVisibleText("Select Brand");
        
        Thread.sleep(2000);
        WebElement UpdatingBtn = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//button[.='Update']"));
        
        if (UpdatingBtn.isDisplayed())
	    {
			w.takeScreenShot(driver, "productPageActionButton_ClearingData3");
			Thread.sleep(2000);
			driver.quit();
		} 
	    else 
	    {
            System.out.println("Updated Successfully");
		}
	    
	    driver.quit();
		
	}
	
	//57TC
	
	@Test
	
	public void productPageActionButton_ClearingData6()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='va']")).clear();
        Thread.sleep(2000);
        
        WebElement UpdateProductsSelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select UpdateProductsSelectCaratDrpDwn = new Select(UpdateProductsSelectCaratDrpDwnElement);

        // Select an option by visible text
        UpdateProductsSelectCaratDrpDwn.selectByVisibleText("Select Carat");
        
        Thread.sleep(2000);
        WebElement UpdatingBtn = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//button[.='Update']"));
        
        if (UpdatingBtn.isDisplayed())
	    {
			w.takeScreenShot(driver, "productPageActionButton_ClearingData6");
			Thread.sleep(2000);
			driver.quit();
		} 
	    else 
	    {
            System.out.println("Updated Successfully");
		}
	    
	    driver.quit();
           
	}
	
	//58TC
	
	@Test
	
	public void productPageActionButton_ClearingData8() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Choker']/..//td[.='Neck Choker']/..//td[.='Kp']/..//td//button[.=' Info ']/../following-sibling::td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='price']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")).clear();
        Thread.sleep(2000);
        
        Thread.sleep(2000);
        WebElement UpdatingBtn = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//button[.='Update']"));
        
        if (UpdatingBtn.isDisplayed())
	    {
			w.takeScreenShot(driver, "productPageActionButton_ClearingData8");
			Thread.sleep(2000);
			driver.quit();
		} 
	    else 
	    {
            System.out.println("Updated Successfully");
		}
	    
	    driver.quit();
		
	}
	
}
























