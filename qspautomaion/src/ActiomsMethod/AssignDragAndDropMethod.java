package ActiomsMethod;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignDragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement src = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable']/descendant::a[@class='button button-orange'])[1]"));
		WebElement dstn = driver.findElement(By.id("amt7"));
		
		 Actions act = new  Actions(driver);
		 act.dragAndDrop(src, dstn);
		
		
		
		
	}

}
