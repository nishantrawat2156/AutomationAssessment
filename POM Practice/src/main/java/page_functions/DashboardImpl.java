package page_functions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import page_repositories.DashboardPage;
import util.BasicActions;

public class DashboardImpl extends BasicActions {

    public DashboardImpl(WebDriver bot) {
        super(bot);
    }

    @Step("Selecting a product")
    public SelectedProductImpl selectProduct() {
        sleep(3);
        click(DashboardPage.Selected_Product);
        return new SelectedProductImpl(bot);
    }

    /**
     * These steps are for verifying the product whether it is removed from the cart or not.
     */
    @Step("Go to Cart for verifying product removal")
    public CartImpl goToCart() {
        click(DashboardPage.Cart_Button);
        return new CartImpl(bot);
    }
}
