package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("username")).SendKeys("admin");
driver.findElement(By.name("pwd")).SendKeys("manager");
driver.findElement(By.LinkText("Login")).click();
	}

}
