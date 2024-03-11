package E_Commerce_FMS;

import static org.testng.Assert.expectThrows;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CommerceProductInfo {
	
    JavaUtility jUtil = new JavaUtility();
	
	String Bangles = "Bangles"+jUtil.getRandomNum();
	
	@Test 
	
	public void eCommerceProductSearchButton() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
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
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("chains",Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();
        
	}
        
        @Test
        
        public void addingProduct() throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[.='Add Product']")).click();
            Thread.sleep(2000);
            
            WebElement CategorynameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

            // Create a Select object from the dropdown element
            Select CategoryNameDrpDwn = new Select(CategorynameDrpDwnElement);

            // Select an option by visible text
            CategoryNameDrpDwn.selectByVisibleText("Gold Chains");
            
            Thread.sleep(2000);
            
            WebElement SubCategorynameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

            // Create a Select object from the dropdown element
            Select SubCategorynameDrpDwn = new Select(SubCategorynameDrpDwnElement);

            // Select an option by visible text
            SubCategorynameDrpDwn.selectByVisibleText("Gods Idol chains");
            
            Thread.sleep(2000);
            
            WebElement BrandnameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

            // Create a Select object from the dropdown element
            Select BrandnameDrpDwn = new Select(BrandnameDrpDwnElement);

            // Select an option by visible text
            BrandnameDrpDwn.selectByVisibleText("a");
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("NeckPiece");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@placeholder='Enter VA%']")).sendKeys("2");
            Thread.sleep(2000);
            
            WebElement SelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

            // Create a Select object from the dropdown element
            Select SelectCaratDrpDwn = new Select(SelectCaratDrpDwnElement);

            // Select an option by visible text
            SelectCaratDrpDwn.selectByVisibleText("22 carat");
            
            Thread.sleep(2000);
            
            WebElement SelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

            // Create a Select object from the dropdown element
            Select SelectTypeCaratDrpDwn = new Select(SelectTypeDrpDwnElement);

            // Select an option by visible text
            SelectTypeCaratDrpDwn.selectByVisibleText("Silver");
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("10000");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='sizes']")).sendKeys("3");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("20");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//textarea[@placeholder='Enter Description']")).sendKeys("GOLD");
            Thread.sleep(2000);
            
            Robot r = new Robot();
            
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            
            WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//input[@formcontrolname='image']"));
            Thread.sleep(2000);
            
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
            driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
            Thread.sleep(2000);
            driver.quit();
            
        	
        }
        
        
        @Test
        
        public void productWeightOrSizesInfoButtonEditButtonSearchButton()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("locket");
            Thread.sleep(2000);
            driver.quit();
           
        	
        }
        
        @Test
        
        public void productWeightOrSizesInfoButtonAddProductSizes()throws Exception
        {
 
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[.='Add Product Sizes']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='size']")).sendKeys("3");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("22");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//button[.='Add']")).click();
            Thread.sleep(2000);
        	driver.quit();
        	
        	
        }
        
        
        @Test
        
        public void productWeightOrSizesInfoButtonEdit()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='NeckPiece']/..//td[.='3']/..//td[.='20']/..//td//button[@class='btn-sm btn-edit mr-2']")).click();
            Thread.sleep(2000);
        	driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//label[.='Product Size']")).sendKeys("4");
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='weight']")).sendKeys("25");
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//button[.='Update']")).click();
        	Thread.sleep(2000);
        	driver.quit();
        	
        }
        
        @Test
        
        public void productWeightOrSizesInfoButtonBootStrap()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='NeckPiece']/..//td[.='3']/..//td[.='20']/..//td//button[@class='btn-sm btn-edit mr-2']/..//div[@class='mdc-switch__track']")).click();
            Thread.sleep(2000);
            driver.quit();
            
        }
        
        @Test
        
        public void productWeightOrSizesInfoButtonDelete() throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='NeckPiece']/..//td[.='3']/..//td[.='20']/..//td//button[@class='btn-sm btn-edit mr-2']/..//div[@class='mdc-switch__track']/../../../following-sibling::button[@class='btn-sm btn-edit bg-danger']")).click();
            Thread.sleep(2000);
            driver.quit();
       
        }
  

        @Test 
        
        public void productStonesViewButtonSearch()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("abc");
            Thread.sleep(2000);
            driver.quit();
            
   
     }
        
        @Test
        
        public void productStonesViewButtonAddingProduct() throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[.='Add Product Stone ']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='stonename']")).sendKeys("Ruby");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='colour']")).sendKeys("blue");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='stoneprice']")).sendKeys("10000");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//input[@formcontrolname='noofstones']")).sendKeys("15");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Add Product Size']/../following-sibling::div//button[.='Add']")).click();
            Thread.sleep(2000);
            driver.quit();
            
        	
        }
        
       
        @Test
        
        public void productStonesViewButtonEditButton()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Ruby']/..//td[.='Ruby']/..//td//button[.=' Edit ']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='stonename']")).sendKeys("Daimond");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='colour']")).sendKeys("Pink");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='stoneprice']")).sendKeys("15000");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//input[@formcontrolname='noofstones']")).sendKeys("20");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[.='Update Product Sizes']/../following-sibling::div//button[.='Update']")).click();
            Thread.sleep(2000);
            driver.quit();
        	
        	
        }
        
        @Test
        
        public void productStonesViewButtonBootStrapButton()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Ruby']/..//td[.='Ruby']/..//td//button[.=' Edit ']/..//div[@class='mdc-form-field']")).click();
            Thread.sleep(2000);
            driver.quit();
        	
        	
        }
        
        
        @Test
        
        public void productStonesViewButtonDeleteButton()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[1]")).click();
            Thread.sleep(2000);
        	driver.findElement(By.xpath("//td[.='Ruby']/..//td[.='Ruby']/..//td//button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']")).click();
        	Thread.sleep(2000);
        	driver.quit();
        		
        }
        
        
        @Test
        
        public void productStonesViewButtonDescription() throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//h1[.='NeckPiece']/..//button[@aria-label='Close'])[1]")).click();
            Thread.sleep(2000);
            driver.quit();
       
            
        }
        
        
        @Test
        
        public void productActionEditButton()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
        	driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[2]/../following-sibling::td//button[@class='btn-sm btn-edit mr-2']")).click();
        	Thread.sleep(2000);
        	
        	 WebElement CategorynameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

             // Create a Select object from the dropdown element
             Select CategoryNameDrpDwn = new Select(CategorynameDrpDwnElement);

             // Select an option by visible text
             CategoryNameDrpDwn.selectByVisibleText("Choker");
             
             Thread.sleep(2000);
             
             WebElement SubCategorynameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

             // Create a Select object from the dropdown element
             Select SubCategoryNameDrpDwn = new Select(SubCategorynameDrpDwnElement);

             // Select an option by visible text
             SubCategoryNameDrpDwn.selectByVisibleText("Normal Chains");
        	
             Thread.sleep(2000);
        	
             WebElement BrandnameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='brandname']"));

             // Create a Select object from the dropdown element
             Select BrandNameDrpDwn = new Select(BrandnameDrpDwnElement);

             // Select an option by visible text
             BrandNameDrpDwn.selectByVisibleText("Gold Box");
        	
             Thread.sleep(2000);
             driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("Gold");
             Thread.sleep(2000);
             driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='va']")).sendKeys("3");
             Thread.sleep(2000);
             
             WebElement SelectnameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='carat']"));

             // Create a Select object from the dropdown element
             Select SelectNameDrpDwn = new Select(SelectnameDrpDwnElement);

             // Select an option by visible text
             SelectNameDrpDwn.selectByVisibleText("22 Carat");
             
             Thread.sleep(2000);
             
             WebElement SelectTypenameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//select[@formcontrolname='type']"));

             // Create a Select object from the dropdown element
             Select SelectTypeNameDrpDwn = new Select(SelectTypenameDrpDwnElement);

             // Select an option by visible text
             SelectTypeNameDrpDwn.selectByVisibleText("Gold");
             
             Thread.sleep(2000);
             driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("16000");
             Thread.sleep(2000);
             driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//textarea[@formcontrolname='description']")).sendKeys("Gold And Silver");
             Thread.sleep(2000);
             
             Robot r = new Robot();
             
             r.keyPress(KeyEvent.VK_TAB);
             r.keyRelease(KeyEvent.VK_TAB);
             
             WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//input[@formcontrolname='image']"));
             Thread.sleep(2000);
             
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
             driver.findElement(By.xpath("//h1[.='Update Product Details']/../following-sibling::div//button[.='Update']")).click();
             Thread.sleep(2000);
             driver.quit();
           
        	
        }
        
     @Test
     
     public void productActionBootStrapButton()throws Exception
     {
    	 
    	 
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
         driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
         Thread.sleep(9000);
         driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[.='Products']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[2]/../following-sibling::td//button[@class='btn-sm btn-edit mr-2']/..//div[@class='mdc-form-field']")).click();
         Thread.sleep(2000);
         driver.quit();
    	 
    	 
     }
        
        @Test
        
        public void productActionDeleteButton()throws Exception
        {
        	
        	WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(9000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Products']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//td[.='Gold Chains']/..//td[.='Gods Idol chains']/..//td[.='NeckPiece']/..//td//img[@class='table-img']/../following-sibling::td//button[@class='btn-sm btn-danger btn-view mr-2']/../following-sibling::td//button[@class='btn-sm btn-view'])[2]/../following-sibling::td//button[@class='btn-sm btn-edit mr-2']/..//button[@class='btn-sm btn-edit bg-danger']")).click();
            Thread.sleep(2000);
            driver.quit();
        	

        }
        
    }
