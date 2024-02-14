package sprint_2_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import genericUtility.WebDriverUtility;

public class aSprint_1_LoginLogout_Demo_FMS {

	WebDriverUtility wUtil = new WebDriverUtility();
	
	@Test
	public void loginLogoutTest() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		wUtil.takeScreenShot(driver, "loginLogoutTest");
		
	}
	
}

