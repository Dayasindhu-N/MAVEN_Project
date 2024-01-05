package generic_lib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;

public class BaseScripts {
	protected ChromeDriver driver = null;

	@BeforeSuite
	public void BeforeSuite() {
	}

	@BeforeTest
	public void BeforeTest() {
	}

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void BeforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys(Excel_Data.readStringData("Sheet2", 0, 1));
		driver.findElement(By.id("Password")).sendKeys(Excel_Data.readStringData("Sheet2", 1, 1));

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@BeforeMethod
	public void BeforeMethod() {
	}

	@AfterMethod
	public void AfterMethod() {
	}

	@AfterClass
	public void AfterClass() {
//		driver.quit();
	}

	@AfterTest
	public void AfterTest() {
	}

	@AfterSuite
	public void AfterSuite() {
	}
}