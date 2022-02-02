package page_functions;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_ors.LoginPage;
import utils.BasicActions;

public class LoginPageImpl extends BasicActions {

    public LoginPageImpl(WebDriver bot) {
        super(bot);
    }
/*
1- Open application
2- Enter incorrect credentials
3- Get the username from DOM
4- Click Login button
*/

    @Step("Verifying that correct site is opened")
    public void verifySite() {
        waitForVisibility(LoginPage.Login_button);
        Assert.assertEquals(pageTitle(), "Swag Labs");
    }

    @Step("Entering incorrect username at first attempt")
    public void incorrectUserName(String username){
        enterText(LoginPage.UserName_text, username);
    }

    @Step("Entering incorrect password at first attempt")
    public void incorrectPassword(String password){
        enterText(LoginPage.Password_text, password);
        click(LoginPage.Login_button);
    }

    @Step("Entering correct username from DOM")
    public void correctUserName(String username){
        sleep(2);
        //getText(LoginPage.DOM_UserName);
        enterText(LoginPage.UserName_text, username);
    }

    @Step("Entering correct password from DOM")
    public void correctPassword(String password){
        sleep(2);
        //getText(LoginPage.DOM_Password);
        enterText(LoginPage.Password_text, password);
    }

    @Step("Clicking on Login button")
    public void clickLogin(){
        sleep(1);
        click(LoginPage.Login_button);
    }
}
