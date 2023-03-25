package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//step 1:Typecasting
TakesScreenshot ts=(TakesScreenshot) driver;
//step 2:we can access the method and store it in RAM
File ramloc=ts.getScreenshotAs(OutputType.FILE);
//step 3:we have to specify the location
File destloc=new File("./photo/ebay.png");
//step 4:copy and paste from RAM to required location
FileUtils.copyFile(ramloc, destloc);
driver.close();
	}

}

