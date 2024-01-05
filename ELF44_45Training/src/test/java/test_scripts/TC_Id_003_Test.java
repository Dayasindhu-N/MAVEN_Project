package test_scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import element_repository.AddToCartButtonPage;
import generic_lib.BaseScripts;

/***
 * @author Dayasindhu.N
 */
public class TC_Id_003_Test extends BaseScripts{
	@Test
	public void addToCart() {
		AddToCartButtonPage item = new AddToCartButtonPage(driver);
		item.getComputers().click();
		item.getDesktops().click();
		item.getProduct().click();
		item.getProductId().click();
		item.getShoppingCartLink().click();
		
		
		if (item.getProduct().isDisplayed()) {
			Reporter.log("Product is added to cart",true);
		} else {
			Reporter.log("Product is not added to cart",true);
		}
	}
}