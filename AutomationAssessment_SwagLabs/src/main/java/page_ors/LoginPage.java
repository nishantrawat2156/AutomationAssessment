package page_ors;

import org.openqa.selenium.By;

public class LoginPage {

    public static final By Login_button = By.id("login-button");
    public static final By UserName_text = By.id("user-name");
    public static final By Password_text = By.id("password");
    public static final By DOM_UserName = By.xpath("//div[@id = 'login_credentials']/h4");
    public static final By DOM_Password = By.xpath("//div[@class = 'login_password']/h4");
}
