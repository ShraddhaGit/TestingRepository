package testpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.0.0.90");
		driver.findElement(By.id("uname")).sendKeys("shraddha@eqw.io");
		driver.findElement(By.name("pswd")).sendKeys("Shraddha@123");
		driver.findElement(By.xpath("//*[@id=\"mainBody\"]/div/app-login/div/div/div/div[2]/div[1]/form/div[4]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/div[3]")).click();
		//driver.findElement(By.linkText(" Create Experience")).click();
		driver.findElement(By.xpath("/html/body/app-root/div[1]/nav/div[1]/popover-container/div[2]/div/div[5]/div/div")).click();
        Thread.sleep(2000);
        driver.quit();

	}

}
