package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	
WebElement user=driver.findElement(By.name("username"));
w.until(ExpectedConditions.visibilityOf(user)).sendKeys("sanju2695_");

		driver.findElement(By.name("password")).sendKeys("sanju@123");
		driver.findElement(By.xpath("//div[contains(@class,'rBNOH')])[1]")).click();
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals("instagram -'rBNOH'"))
			{
				System.out.println("pass:home page is displayed");
			}
			else
			{
				System.out.println("fail:home page is not displayed");
			}
	}

}
