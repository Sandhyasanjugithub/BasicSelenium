package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));

		if(login.isEnabled()) {
			System.out.println("Pass:element is enabled");
			login.click();
		}
		
		else
		{
			System.out.println("Fail:elemet is not enabled");
		}
	}
	

	}


