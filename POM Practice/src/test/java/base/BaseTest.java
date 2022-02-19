package base;

import config.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page_functions.LoginImpl;
import util.Bot;
import util.Logger;

public class BaseTest {

    protected WebDriver bot;

    protected LoginImpl loginImpl;

    @BeforeClass
    public void openBrowser() {
        bot = new Bot().getBot();
        bot.get(Properties.url);
        loginImpl = new LoginImpl(bot);
    }

    protected static void stepLog(String step) {
        Logger.step(step);
    }

    @AfterClass
    public void close() {
        bot.quit();
    }


}
