package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelDataAct {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/TestDataAct", "validcreds", 1, 0);
		String password = flib.readExcelData("./data/TestDataAct", "validcreds", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
