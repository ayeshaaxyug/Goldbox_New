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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        
        WebElement ProductsLnk = driver.findElement(By.xpath("//a[.='Products']"));
        Thread.sleep(3000);
        
        if (ProductsLnk.isDisplayed()) 
        {
        	
           w.takeScreenShot(driver, "productsLink");
           Thread.sleep(3000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(6000);
        
        WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		
        SearchEdt.sendKeys("Necklace");
        
        if (SearchEdt.isDisplayed())
        {
			w.takeScreenShot(driver, "searchEditFeildProduct");
			Thread.sleep(6000);
			Assert.fail();
			Thread.sleep(6000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(6000);
        
        WebElement AddingProduct = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(6000);
        
        if (AddingProduct.isDisplayed()) 
        {
			w.takeScreenShot(driver, "addingProductNull");
			Thread.sleep(6000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(6000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(6000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(6000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "productsGivingOnlyCategoryName");
			Thread.sleep(6000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(6000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(6000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(6000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing2Values");
			Thread.sleep(6000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(6000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(6000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(6000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing3Values");
			Thread.sleep(6000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(6000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(6000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(6000);
        
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(6000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing4Values");
			Thread.sleep(6000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(6000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(6000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(6000);
        
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(6000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing5Values");
			Thread.sleep(6000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(6000);
        
        WebElement ProductsCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsCategoryNameDrpDwn = new Select(ProductsCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsSubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select ProductsSubCategoryNameDrpDwn = new Select(ProductsSubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        ProductsSubCategoryNameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(6000);
        
        WebElement ProductsBrandNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select ProductsBrandNameDrpDwn = new Select(ProductsBrandNameyDrpDwnElement);

        // Select an option by visible text
        ProductsBrandNameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(6000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Bangles001");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("10");
        Thread.sleep(6000);
        
        WebElement ProductsSelectCaratyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select ProductsSelectCaratDrpDwn = new Select(ProductsSelectCaratyDrpDwnElement);

        // Select an option by visible text
        ProductsSelectCaratDrpDwn.selectByVisibleText("24 carat");
        
        Thread.sleep(6000);
        WebElement ProductCategoryName = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(6000);
        
        if (ProductCategoryName.isDisplayed())
        {
			w.takeScreenShot(driver, "addingProductsByPassing6Values");
			Thread.sleep(6000);
			driver.quit();
		} 
        else 
        {
             System.out.println("Product added Successfully");
		}
        
        driver.quit();
		
		
	}
	
}
























