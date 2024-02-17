package sprint_2_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionButtonSchemeFeatureNull {
	
	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	
	public void schemeFeatureNotAddedSuccessfully()throws Exception
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

		 for (int i = 1; i <= 9; i++)
	        {
	        	 Thread.sleep(3000);
	        	 driver.findElement(By.xpath("//a[text()=' Next ']")).click();
	        	 Thread.sleep(3000);
			}
	        
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//td[.='GGOOLLDD']/..//td[.='MY GOLD']/..//button[.=' View ']/../..//td//button[.=' Info '])[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h4[.='Scheme Info']/../../following-sibling::div//textarea[@formcontrolname='content']")).sendKeys("Gold");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h4[.='Scheme Info']/../../following-sibling::div//textarea[@formcontrolname='content']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[.='Scheme Info']/../../following-sibling::div//textarea[@formcontrolname='content']/../../../../following-sibling::div/following-sibling::div//h6[.='Add Feature']")).click();
		Thread.sleep(3000);
		
		WebElement ErrorMessage = driver.findElement(By.xpath("//h1[.='Add Feature']/../following-sibling::div//button[.='Add']"));
		Thread.sleep(3000);
		
		if (ErrorMessage.isDisplayed())
		{
			w.takeScreenShot(driver, "schemeFeatureNotAddedSuccessfully");
			Thread.sleep(3000);
		} 
		else 
		{
            System.out.println("Scheme Feature is Added Successfully");
            Thread.sleep(3000);
		}
		
	     driver.quit();
		
	}

}
