package SreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way5TakesScewwbShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 TakesScreenshot tscm = (TakesScreenshot)driver;
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("file:///C:/Users/Computer%20Clinic/Desktop/html/checkbox.html");
		 Thread.sleep(2000);
		 
		 File src = tscm.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./screenshots/screenshot5.jpg");
		 Files.copy(src, dest);
	}

}
