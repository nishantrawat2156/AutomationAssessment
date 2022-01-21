package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Bot;



public class BasicActionsIntegration {

    protected WebDriver bot; //Initialized and created for instance
    protected static final String URL = "http://automationpractice.com/"; //Equipped with provided URL

    @BeforeClass //Annotation to perform before class steps
    public void openBrowser() {
        bot = new Bot().getBot();
        bot.get(URL);
    }

    protected static void stepLog(String step) {
        Logger.step(step);
    }

    @AfterClass //Annotation to perform after class steps
    public void close() {
        bot.quit();
    }

}
