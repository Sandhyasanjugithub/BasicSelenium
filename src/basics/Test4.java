package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();

	}

}
