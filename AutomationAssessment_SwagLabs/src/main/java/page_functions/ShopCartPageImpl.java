package page_functions;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_ors.LoginPage;
import page_ors.ShopCartPage;
import utils.BasicActions;

public class ShopCartPageImpl extends BasicActions {

    public ShopCartPageImpl(WebDriver bot) {
        super(bot);
    }
/*
1- Open application
2- Get the credentials from DOM
3- Click Login button
4- Add an item to cart
5- Go to Cart and Verify item and price
6- Check the cart again after form submission

 */
     @Step("Verify that correct site is opened")
     public void verifySite() {
         waitForVisibility(LoginPage.Login_button);
         Assert.assertEquals(pageTitle(), "Swag Labs");
     }

     @Step("Enter correct username from DOM")
     public void correctUserName(String username) {
        enterText(ShopCartPage.UserName_text, username);
     }

     @Step("Enter correct password from DOM")
     public void correctPassword(String password) {
        enterText(ShopCartPage.Password_text, password);
     }

     @Step("Clicking on Login button")
     public void clickLogin() {
        click(ShopCartPage.Login_button);
     }

     @Step("Select a product from the list")
     public void selectProduct() {
         sleep(3);
         click(ShopCartPage.Select_Product);
     }

     @Step("Adding item to cart")
     public void addToCart() {
         sleep(3);
         ShopCartPage.ProdTextName = textRetriever(ShopCartPage.ProductName);
         ShopCartPage.ProdTextPrice = textRetriever(ShopCartPage.ProductPrice);
         click(ShopCartPage.AddToCart);
     }

     @Step("Click on cart button")
     public void clickCart() {
         click(ShopCartPage.Cart_button);
     }

     @Step("Verifying product name at checkout")
     public void verifyProductName() {
         System.out.println("Name checking has started");
         Assert.assertTrue(dataMatcher(ShopCartPage.ProdTextName, ShopCartPage.CartProductName));
         System.out.println("Name checking is completed");
     }

     @Step("Verifying product price at checkout")
     public void verifyProductPrice() {
         System.out.println("Price checking has started");
         Assert.assertTrue(dataMatcher(ShopCartPage.ProdTextPrice, ShopCartPage.CartProductPrice));
         System.out.println("Price checking is completed");
     }

     @Step("Click checkout button")
     public void clickCheckout() {
         sleep(2);
         click(ShopCartPage.Checkout_button);
     }

     @Step("Fill first name of buyer")
     public void enterFirstName(String first_name){ enterText(ShopCartPage.ownerFirstName, first_name); }

     @Step("Fill last name of buyer")
     public void enterLastName(String last_name){ enterText(ShopCartPage.ownerLastName, last_name); }

     @Step("Fill postal code of buyer")
     public void enterPostalCode(String postal_code){ enterNumber(ShopCartPage.postalCode, postal_code ); }

     @Step("Click continue and finish button")
     public void clickContinueAndFinish() {
         sleep(2);
        click(ShopCartPage.continue_button);
        click(ShopCartPage.finish_button);
    }

     @Step("Go to Cart to verify cart removal")
     public void verifyProductRemoved() {
         click(ShopCartPage.backHome_button);
         sleep(1);
         click(ShopCartPage.Cart_button);
         sleep(1);
         verifyProductRemoval(By.id(ShopCartPage.ProdTextName));
     }
}
