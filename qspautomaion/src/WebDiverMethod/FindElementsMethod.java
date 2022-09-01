package WebDiverMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//input[@nAME='q']")).sendKeys("bike");
		  Thread.sleep(2000);
		List<WebElement> webElementSuggestion = driver.findElements(By.xpath("//span[.='bikewale']"));
		for(WebElement sugg: webElementSuggestion) {
			String webElement = sugg.getText();
			
			System.out.println(webElement);
			  Thread.sleep(1000);
		}
		 
		
		
	}
}
	