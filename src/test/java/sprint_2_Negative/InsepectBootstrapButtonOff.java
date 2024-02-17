package sprint_2_Negative;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InsepectBootstrapButtonOff {
	
	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	public void insepectBootstrapButtonOff()throws Exception
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        try
        {
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath(" //span[.='Schemes']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Scheme List']"));
        Thread.sleep(2000);
        
        for (int i = 1; i <= 9; i++)
        {
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//a[text()=' Next ']")).click();
        	 Thread.sleep(2000);
		}
        
        Thread.sleep(2000);
        WebElement MyScheme = driver.findElement(By.xpath("//td[.='GGOOLLDD']"));
        String myScheme = MyScheme.getText();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[.='GGOOLLDD']/..//td[.='MY GOLD']/..//button[.=' View ']/../..//td//button[.=' Info '])[3]/..//button[.=' Edit ']/..//div/button//div[@class='mdc-switch__icons']")).click();
        Thread.sleep(2000);
        
        }
        catch(Exception e)
        {
			driver.quit();
		}
	}
	
	@Test
    public void userPannel()throws Exception 
    {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
	    driver.get("http://stg.goldbox.gold/login");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698" , Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	    Thread.sleep(2000);
	    
	    try 
	    {
	    	WebElement SchemesColumn = driver.findElement(By.xpath("//div[@class='row ng-star-inserted']"));
		    
		    WebElement Scheme = driver.findElement(By.xpath("//h4[.='GGOOLLDD']"));
		    
		    String MyScheme = Scheme.getText();
		    
		    String TotalSchemes = SchemesColumn.getText();
		    
		    Thread.sleep(2000);
		    
		    System.out.println(TotalSchemes);
	    	
	    	if (TotalSchemes.contains(MyScheme)) 
		    {
		    	System.out.println("Scheme Is Displayed");
			}
	        else  
	        {
	            System.out.println("Scheme is Not Displayed");   
			}
		} 
	    finally 
	    {
	    	w.takeScreenShot(driver, "userPannel");
	    	Thread.sleep(2000);
	    	driver.quit();
		} 
	          		     
    }	
     
}
        
