package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicActions {

    protected final WebDriver bot;
    protected final WebDriverWait waiter;

    protected BasicActions(WebDriver bot){
        this.bot = bot;
        this.waiter = new WebDriverWait(bot, 4);
    }

    protected boolean waitForVisibility(By element){
        boolean isVisible = true;
        try{
            waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException to) {
            isVisible = false;
        }
        return isVisible;
    }

    protected boolean verifyProductRemoval(By element) {
        boolean isProdVisible = false;
        try{
            waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException to) {
            isProdVisible = true;
        }
        return isProdVisible;
    }

    protected void click(By element) {
        bot.findElement(element).click();
    }

    protected void enterText(By element, String text) {
        bot.findElement(element).sendKeys(text);
    }

    protected String pageTitle() {
        return bot.getTitle();
    }

    //Method to check if a web element is present or not
    protected boolean checkElement(By element) {
        if(bot.findElement(element) != null){
            return true;
        }else{
            return false;
        }
    }

    protected String textRetriever(By element) {
        return bot.findElement(element).getText();
    }

    protected boolean dataMatcher(String data, By element) {
        String text = textRetriever(element);
        if (text.equals(data)) {
            return true;
        } else {
            return false;
        }
    }

    protected void enterNumber(By element, String number) {
        bot.findElement(element).sendKeys(number);
    }

    public static void sleep(double sec) {
        try {
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
