package element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartButtonPage extends ProductPage {

	public AddToCartButtonPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "add-to-cart-button-72")
	private WebElement productId;
	
	public WebElement getProductId() {
		return productId;
	}
}
