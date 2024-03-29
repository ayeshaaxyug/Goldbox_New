package sprint_2_Negative;

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

public class MissedFeildsAreAddedInScheme {
	
	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	
	public void addingSchemeTest()throws Exception
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
        Thread.sleep(8000);
        driver.findElement(By.xpath(" //span[.='Schemes']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Scheme List']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h6[@class='btn btn-added']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Scheme Name']")).sendKeys("Gold",Keys.ENTER);
        Thread.sleep(3000);
        
        WebElement CountrydropdownElement = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));

        // Create a Select object from the dropdown element
        Select CountryDrpDwn = new Select(CountrydropdownElement);

        // Select an option by visible text
        CountryDrpDwn.selectByVisibleText("Bolivia");
        
        Thread.sleep(3000);
        
        WebElement CalculationdropdownElement = driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//select[@formcontrolname='scheme_calculation_type']"));

        // Create a Select object from the dropdown element
        Select CalculationTypeDrpDwn = new Select(CalculationdropdownElement);

        // Select an option by visible text
        CalculationTypeDrpDwn.selectByIndex(1);
        
        Thread.sleep(3000);        
        driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Gold Is Rare");
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//button[.='Add']")).click();
       // Thread.sleep(3000);   
       
        WebElement AddingScheme = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(3000);
        
        /*
        if (AddingScheme.isDisplayed())
        {
		    w.takeScreenShot(driver, "addingScheme");
		    Thread.sleep(3000);
		    Assert.fail();
		    Thread.sleep(3000);
		} 
        else 
        {
        	System.out.println("Add Scheme is not displayed");
        	Thread.sleep(2000);
		}
		*/
		
        w.takeScreenShot(driver,"addingScheme" );
        Thread.sleep(2000);
	    driver.quit();
        
	}

}
