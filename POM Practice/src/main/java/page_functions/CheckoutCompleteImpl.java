package page_functions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import page_repositories.CheckoutCompletePage;
import util.BasicActions;

public class CheckoutCompleteImpl extends BasicActions {

    public CheckoutCompleteImpl(WebDriver bot) {
        super(bot);
    }

    @Step("Click Back Home button")
    public DashboardImpl clickBackHome() {
        click(CheckoutCompletePage.Back_To_Home_Button);
        return new DashboardImpl(bot);
    }
}
