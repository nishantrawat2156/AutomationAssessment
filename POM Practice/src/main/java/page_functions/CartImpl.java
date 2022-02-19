package page_functions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page_repositories.CartPage;
import page_repositories.SelectedProductPage;
import util.BasicActions;

public class CartImpl extends BasicActions {

    public CartImpl(WebDriver bot) {
        super(bot);
    }

    private String cartName, productName;
    private String cartPrice, productPrice;

    @Step("Verify name and price of selected product")
    public boolean verifyProduct() {
        sleep(3);
        cartName = bot.findElement(CartPage.Cart_Product_Name).getText();
        cartPrice = bot.findElement(CartPage.Cart_Product_Price).getText();

        productName= bot.findElement(SelectedProductPage.Product_Name).getText();
        productPrice= bot.findElement(SelectedProductPage.Product_Price).getText();

        if ((cartName.equals(productName)) && (cartPrice.equals(productPrice))) {
            return true;
        } else {
            return false;
        }
    }

    @Step("Proceed to checkout")
    public CheckoutInfoImpl clickCheckout() {
        click(CartPage.Checkout_Button);
        return new CheckoutInfoImpl(bot);
    }

    /**
     * Verifying product removal here
     */
    @Step("Check whether the cart is empty")
    public void checkProductRemoval() {

    }
}
