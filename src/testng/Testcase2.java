package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 {
	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	public void tc2()
	{
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//div[contains(@class,'_4zcq')][1]")).click();
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(), true);
	}
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}}

