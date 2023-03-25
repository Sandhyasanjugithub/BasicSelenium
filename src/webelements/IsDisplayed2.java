package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement usertb = driver.findElement(By.xpath("//input[contains(@class,'desktop-searchBar')]"));
if(usertb.isDisplayed())
{
	System.out.println("pass:element is displayed");
	usertb.sendKeys("shirts");
}
else
{
	System.out.println("fail:element is not displayed");
}
	}

}
