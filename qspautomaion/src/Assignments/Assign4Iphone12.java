package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4Iphone12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String parentTab = driver.getWindowHandle();
		Set<String> childTab = driver.getWindowHandles();
		for(String tab:childTab) {
		
			if(!parentTab.equals(tab)) {
				driver.switchTo().window(tab);
			}
		}
			
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
		driver.findElement(By.xpath("//a[@class='_1fGeJ5' and .='256 GB']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.findElement(By.xpath("//div[@class='_3dsJAO' and .='Remove']")).click();
	
	}
}
