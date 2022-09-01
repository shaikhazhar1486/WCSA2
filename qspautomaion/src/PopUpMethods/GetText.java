package PopUpMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Computer%20Clinic/Desktop/html/alert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();
	Thread.sleep(2000);
String text = alt.getText();
	System.out.println(text);
	alt.accept();
		

	}

}
