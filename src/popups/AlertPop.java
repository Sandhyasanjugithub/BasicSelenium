package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlertPop
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='munit testing ']")).click();
		WebElement add = driver.findElement(By.id("add"));
		a.doubleClick(add).perform();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	Alert a1 = driver.switchTo().alert();
	System.out.println(a1.getText());
	a1.accept();

	Thread.sleep(3000);
	a1.dismiss();
	}
}


