package page_functions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import page_repositories.SelectedProductPage;
import util.BasicActions;

public class SelectedProductImpl extends BasicActions {

    public SelectedProductImpl(WebDriver bot) {
        super(bot);
    }

    @Step("Saving product name and product price")
    public void saveProductDetails() {
        sleep(3);
        storeText(SelectedProductPage.Product_Name);
        storeText(SelectedProductPage.Product_Price);
    }

    @Step("Adding product to cart")
    public void addToCart() {
        click(SelectedProductPage.Add_To_Cart_Button);
    }

    @Step("Clicking on cart button to checkout")
    public CartImpl clickOnCart() {
        click(SelectedProductPage.Cart_Button);
        return new CartImpl(bot);
    }

}
