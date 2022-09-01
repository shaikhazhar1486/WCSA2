package SreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    RemoteWebDriver rwd = (RemoteWebDriver)driver;

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/Computer%20Clinic/Desktop/html/checkbox.html");
	Thread.sleep(3000);
	 File scr = rwd.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./screenshots/screenshot3");
	 Files.copy(scr, dest);
	
	
	
	}

}
