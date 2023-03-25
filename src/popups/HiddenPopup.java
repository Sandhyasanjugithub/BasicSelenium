`1package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {

	public static void main(String[] args) throws InterruptedException{
		 
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//label[text()='Date']")).click();
			driver.findElement(By.xpath("//td[text()='28']")).click();

	}

}
