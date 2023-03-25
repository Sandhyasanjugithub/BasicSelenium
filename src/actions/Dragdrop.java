package actions;

import org.openqa.selenium.WebDriver;

public class Dragdrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findelement(By.xpath("//h2[text()='Progress Bars & Sliders']")).click();
driver.findelement(By.xpath("//a[text()='Drag & Drop Sliders']")).click();
 WebElement slider=driver.findelement(By.id("rangeSuccess")).click();
 Actions a=new Actions();
 a.dragAndDropBy(slider,95,0).perform();
 
		 
	}

}
