package Stale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.name("username"));
		driver.navigate().refresh();
		username.sendKeys("admin");
		
	}

}
