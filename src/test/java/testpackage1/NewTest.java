package testpackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest
{
	 WebDriver driver;
  @BeforeClass
  public void initialisedriver()
  {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
  }
	@Test(priority=0)
  public void Login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.0.0.90");
		Thread.sleep(2000);
		
		driver.findElement(By.id("uname")).sendKeys("shraddha@eqw.io");
		driver.findElement(By.name("pswd")).sendKeys("Shraddha@123");
		driver.findElement(By.xpath("//*[@id=\"mainBody\"]/div/app-login/div/div/div/div[2]/div[1]/form/div[4]/div/button")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/div[3]")).click();
		//driver.findElement(By.linkText(" Create Experience")).click();
		//driver.findElement(By.xpath("/html/body/app-root/div[1]/nav/div[1]/popover-container/div[2]/div/div[5]/div/div")).click();
        //Thread.sleep(2000);
	}  
       @Test(priority=1)
       public void Dashboard()
      {
       
        driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-dashboard/div[1]/div[2]/div/div[1]/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/modal-container/div/div/form/div[2]/div/div[2]/div[1]/span/input")).sendKeys("GT-Auto");
        driver.findElement(By.xpath("/html/body/modal-container/div/div/form/div[2]/div/div[2]/div[3]/button[1]")).click();
      }
            
  
	@AfterClass
	public void browserclose()
	{
		 driver.quit();
	}
}
