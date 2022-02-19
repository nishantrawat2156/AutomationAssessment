package page_functions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page_repositories.LoginPage;
import util.BasicActions;

public class LoginImpl extends BasicActions {

    protected WebDriver bot1;

    public LoginImpl(WebDriver bot) {
        super(bot);
        this.bot1 = bot;
    }

    @Step("Verify that correct site is opened")
    public void verifySite() {
        sleep(3);
        Assert.assertEquals(bot1.getTitle(), "Swag Labs");
    }

    @Step("Enter login details")
    public DashboardImpl enterCredentials() {
        enterUsername(LoginPage.UserName_Text);
        enterPassword(LoginPage.Password_Text);
        click(LoginPage.Login_Button);
        return new DashboardImpl(bot1);
    }
}
