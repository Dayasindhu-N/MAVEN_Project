package element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends CategoryPage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Build your own cheap computer']")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}
}