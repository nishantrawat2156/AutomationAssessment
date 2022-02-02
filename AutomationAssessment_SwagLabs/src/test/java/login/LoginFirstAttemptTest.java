package login;

import core.BasicActionsIntegration;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_functions.LoginPageImpl;

public class LoginFirstAttemptTest extends BasicActionsIntegration {

    LoginPageImpl loginObject1;

    @Test
    @Description("Creating LoginPageImpl objects before class")
    public void initImpl() { loginObject1 = new LoginPageImpl(bot); }

    @Test(dependsOnMethods = "initImpl")
    @Description("Logging in via DOM credentials in first attempt")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 1")
    @Story("Story 1")
    @Owner("Nishant Rawat")
    public void test_to_verify_if_first_one_is_correct() {

        stepLog("Verify that correct site is opened");
        loginObject1.verifySite();

        stepLog("Get correct details from DOM");
        loginObject1.correctUserName("standard_user");
        loginObject1.correctPassword("secret_sauce");

        stepLog("Click login button");
        loginObject1.clickLogin();
    }

}
