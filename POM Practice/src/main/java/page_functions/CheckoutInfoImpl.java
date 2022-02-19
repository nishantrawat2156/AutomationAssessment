package page_functions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import page_repositories.CheckoutInfoPage;
import util.BasicActions;

public class CheckoutInfoImpl extends BasicActions {

    public CheckoutInfoImpl(WebDriver bot) {
        super(bot);
    }

    @Step("Enter information for checkout")
    public void enterCheckoutDetails() {
        sleep(3);
        enterFirstNameForCheckout(CheckoutInfoPage.First_Name);
        enterLastNameForCheckout(CheckoutInfoPage.Last_Name);
        enterPinCodeForCheckout(CheckoutInfoPage.Postal_Code);
    }

    @Step("Click continue button to further proceed")
    public CheckoutOverviewImpl clickContinue() {
        click(CheckoutInfoPage.Continue_Button);
        return new CheckoutOverviewImpl(bot);
    }
}
