package util;

import config.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasicActions {

    protected final WebDriver bot;

    public BasicActions(WebDriver bot) {
        this.bot = bot;
    }

//    //protected String pageTitle() {
//        return bot.getTitle();
//    }

    protected void enterUsername(By element) {
        bot.findElement(element).sendKeys(Properties.username);
    }

    protected void enterPassword(By element) {
        bot.findElement(element).sendKeys(Properties.password);
    }

    protected void click(By element) {bot.findElement(element).click();}

    protected void storeText(By element) {bot.findElement(element).getText(); }

    protected void enterFirstNameForCheckout(By element) {bot.findElement(element).sendKeys(Properties.firstName);}

    protected void enterLastNameForCheckout(By element) {bot.findElement(element).sendKeys(Properties.lastName);}

    protected void enterPinCodeForCheckout(By element) {bot.findElement(element).sendKeys();}

    public static void sleep(double sec) {
        try {
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
