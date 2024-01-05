package element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "termsofservice")
	private WebElement checkBox;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
}