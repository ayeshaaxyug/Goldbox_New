package sprint_2_Negative;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithInvalidPasswsord {
	
	WebDriverUtility w = new WebDriverUtility();
	
	@Test
	
	public void loginWithInvalidPasswsordTest()throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(9000);
        driver.get("http://stg-fms-goldbox.goldsikka.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("Soumyaa@gmail.com",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@123",Keys.ENTER);
        Thread.sleep(3000);
        w.takeScreenShot(driver, "loginWithInvalidPasswsord");
        Thread.sleep(3000);
        driver.quit();
		
	}

}
