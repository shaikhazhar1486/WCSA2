package SreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Computer%20Clinic/Desktop/html/checkbox.html");
		Thread.sleep(3000);
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot1");
		Files.copy(scr,dest);
		
		
	}

}
