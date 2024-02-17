package sprint_2_Negative;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RazorPaySuccessButtonPaymentFail {
	
	    //USER END
	
		WebDriverUtility w = new WebDriverUtility();
		
		@Test
		
		public void razorPaySuccessButtonPaymentFail()throws Exception
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
		    driver.findElement(By.xpath("//h4[.='GOLD PLUS PLAN']/..//button[.='Subscribe']")).click();
		    Thread.sleep(2000);
		    WebElement AmountDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='amount']"));

	        // Create a Select object from the dropdown element
	        Select dropdown1 = new Select(AmountDrpDwn);

	        // Select an option by visible text
	        dropdown1.selectByVisibleText("1000");
	        
	        Thread.sleep(2000);
	        
	        WebElement AmountDrpDwn1 = driver.findElement(By.xpath("//select[@formcontrolname='amount']"));

	        // Create a Select object from the dropdown element
	        Select dropdown01 = new Select(AmountDrpDwn1);

	        // Select an option by visible text
	        dropdown01.selectByVisibleText("1000");
	        
	        
	        WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));

	        // Create a Select object from the dropdown element
	        Select dropdown11 = new Select(MonthsDrpDwn);

	        // Select an option by visible text
	        dropdown11.selectByVisibleText("12 Months");
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[.=' View Coupons ']")).click();
			
			Thread.sleep(2000);
			
	        driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Coupon Code']")).sendKeys("ews234");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.='Apply']")).click();
			
			Thread.sleep(2000);
			
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000);");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		       
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
			
			Thread.sleep(2000);
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
			
			driver.switchTo().frame(iframe);
			
			Thread.sleep(2000);
			
			
	        driver.findElement(By.xpath("//span[.='Contact Details']/ancestor::div[@class='contact-title-container svelte-1m451hi']/following-sibling::div/descendant::div[@class='elem elem-one-click-checkout  svelte-1lowomx']/following-sibling::div/input[@name='contact']")).sendKeys("6309631698");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.='Proceed']")).click();
		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h3[.='UPI, Cards & more']/..//button[@class='new-method has-tooltip false svelte-1d17g67'])[1]")).click();
			
			Thread.sleep(2000);
			//(//div[.='Pay with UPI ID/ Mobile Number'])[1]/..//label[.='Enter UPI ID/ Mobile Number']
			driver.findElement(By.xpath("(//div[.='Pay with UPI ID/ Mobile Number'])[1]/..//label[@class='svelte-1cfdp3q']")).click();
			
			Thread.sleep(2000);//div[.='Pay with UPI ID/ Mobile Number']/../following-sibling::div//label[.='Enter UPI ID/ Mobile Number']
			
			driver.findElement(By.xpath("//div[.='Pay with UPI ID/ Mobile Number']/../following-sibling::div//label[.='Enter UPI ID/ Mobile Number']")).sendKeys("6309631698");
			
			Thread.sleep(2000);
			
	        driver.findElement(By.xpath("//button[.='Pay Now']")).click();
			
			Thread.sleep(2000);
			
			driver.quit();

			
			
			
			
			
			
			
		}
		

}
