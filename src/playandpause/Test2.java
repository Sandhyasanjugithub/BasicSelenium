package playandpause;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args)  throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/rad");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("search"));

		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//button[contains(@class,'ytp-play-button ')][2]")).click();
          Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(@class,'ytp-play-button ')][1]")).click();

		driver.switchTo().defaultContent();

	driver.close();


	}	

	


	

	}


