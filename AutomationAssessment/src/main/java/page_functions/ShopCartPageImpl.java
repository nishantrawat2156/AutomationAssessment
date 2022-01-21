package page_functions;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_ors.ShopCartPage;
import utils.BasicActions;

public class ShopCartPageImpl extends BasicActions {

    public ShopCartPageImpl(WebDriver bot) {
        super(bot);
    }
/*
1- Open Application
2- Click on Dresses | Casual Dresses
3- Select one Item from Result and add to cart
4- Open the cart and verify the same item added in cart and price is correct
 */

    @Step("Clicking on Dresses")
    public void clickDresses() {
        sleep(8);
        click(ShopCartPage.Dresses);
        sleep(6);
    }

    @Step("Clicking on Casual Dresses")
    public void clickCasualDresses() {
        click(ShopCartPage.CasualDresses);
    }

    @Step("Selecting the Product")
    public void selectProduct() {
        sleep(3);
        click(ShopCartPage.Product);
    }

    @Step("Adding the product to cart")
    public void addToCart() {

        sleep(3);
        //Saving the product name for verifying with the cart
        ShopCartPage.ProdTextName = textRetriever(ShopCartPage.ProductName);

        //Saving the product price for verifying with the cart
        ShopCartPage.ProdTextPrice = textRetriever(ShopCartPage.ProductPrice);

        //Adding the product to cart
        click(ShopCartPage.AddToCart);
    }

    @Step("Closing the pop up")
    public void closePopup() {
        clickPopupElement(ShopCartPage.PopupCross);
    }

    @Step("Opening the cart")
    public void openCart() {
        click(ShopCartPage.Card_btn);
    }

    @Step("Verifying the product name")
    public void verifyDress() {
        System.out.println("Name checking has started");
        Assert.assertTrue(dataMatcher(ShopCartPage.ProdTextName, ShopCartPage.CartProductName));
        System.out.println("Name checking is completed");
    }

    @Step("Verifying the product price")
    public void verifyPrice() {
        System.out.println("Price checking has started");
        Assert.assertTrue(dataMatcher(ShopCartPage.ProdTextPrice, ShopCartPage.CartProductPrice));
        System.out.println("Price checking is completed");
    }

}
