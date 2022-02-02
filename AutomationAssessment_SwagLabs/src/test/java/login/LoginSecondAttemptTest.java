package login;

import core.BasicActionsIntegration;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_functions.LoginPageImpl;

public class LoginSecondAttemptTest extends BasicActionsIntegration {

    LoginPageImpl loginObject2;

    @Test
    @Description("Creating LoginPageImpl objects before class")
    public void initImpl() {
        loginObject2 = new LoginPageImpl(bot);
    }

    @Test(dependsOnMethods = "initImpl")
    @Description("Logging in via DOM credentials in second attempt")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 1")
    @Story("Story 2")
    @Owner("Nishant Rawat")
    public void test_to_verify_if_first_one_is_not_correct() {

        stepLog("Verify that correct site is opened");
        loginObject2.verifySite();

        stepLog("Enter incorrect details");
        loginObject2.incorrectUserName("imnishu_07");
        loginObject2.incorrectPassword("password123");
        loginObject2.clickLogin();

        stepLog("Get correct details from DOM");
        loginObject2.correctUserName("standard_user");
        loginObject2.correctPassword("secret_sauce");

        stepLog("Click login button");
        loginObject2.clickLogin();
    }
}

