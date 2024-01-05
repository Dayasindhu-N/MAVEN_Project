package demo_programs;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Casio_Test {
	
	@Test(groups = "Smoke")
	public void game() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.casio.com/");
		driver.quit();
	}
}