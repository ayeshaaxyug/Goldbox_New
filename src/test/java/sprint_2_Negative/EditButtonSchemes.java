package sprint_2_Negative;

import static org.testng.Assert.expectThrows;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditButtonSchemes {

	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	
	public void editButtonSchemes() throws Exception
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
        driver.findElement(By.xpath("//span[.='3']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//td[.='GGOOLLDD']/..//td[.='MY GOLD']/..//button[.=' View ']/../..//td//button[.=' Info '])[3]/..//button[.=' Edit ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//input[@placeholder='Enter Scheme Name']")).clear();
        Thread.sleep(3000);
        
        WebElement CountrydropdownElement = driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//select[@formcontrolname='country']"));

        // Create a Select object from the dropdown element
        Select CountryDrpDwn = new Select(CountrydropdownElement);

        // Select an option by visible text
        CountryDrpDwn.selectByVisibleText("Select Country");
        
        Thread.sleep(3000);
        
        WebElement CalculationdropdownElement = driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//select[@formcontrolname='country']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));

        // Create a Select object from the dropdown element
        Select CalculationTypeDrpDwn = new Select(CalculationdropdownElement);

        // Select an option by visible text
        CalculationTypeDrpDwn.selectByVisibleText("Select Type");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).clear();
        Thread.sleep(3000);
        WebElement ErrorMessage = driver.findElement(By.xpath("//h1[.='Edit Scheme']/../..//following-sibling::div//button[.='Update']"));
        Thread.sleep(3000);
        
        if (ErrorMessage.isDisplayed())
        {
			w.takeScreenShot(driver, "editButtonSchemes");
			Thread.sleep(3000);
			
		} 
        else
        {
            System.out.println("Scheme is Updated");
            Thread.sleep(3000);
		}
        
		driver.quit();
		
	}
	
}
