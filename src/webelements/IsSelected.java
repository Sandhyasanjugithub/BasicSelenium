package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[@role=\"button\"])[2]")).click();
WebElement button = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));

if(button.isSelected())
{
	System.out.println("pass:button is selected");
	button.click();
	}
else
{
	System.out.println("fail:button is not selected");
}
	driver.close();

	}



	}


