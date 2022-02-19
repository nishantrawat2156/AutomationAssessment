package page_functions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import page_repositories.CheckoutOverviewPage;
import util.BasicActions;

public class CheckoutOverviewImpl extends BasicActions {

    public CheckoutOverviewImpl(WebDriver bot) {
        super(bot);
    }

    @Step("Click finish button")
    public CheckoutCompleteImpl clickFinish() {
        click(CheckoutOverviewPage.Finish_Button);
        return new CheckoutCompleteImpl(bot);
    }
}
