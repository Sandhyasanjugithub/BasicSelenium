package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("manager");
driver.findElement(By.name("login")).click();
	}

}
