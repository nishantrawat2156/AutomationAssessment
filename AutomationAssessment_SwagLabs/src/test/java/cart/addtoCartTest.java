package cart;

import core.BasicActionsIntegration;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_functions.ShopCartPageImpl;

public class addtoCartTest extends BasicActionsIntegration {

    ShopCartPageImpl cartObject;

    @Test
    @Description("Creating ShopCartPageImpl objects before class")
    public void initImpl() { cartObject = new ShopCartPageImpl(bot); }

    @Test(dependsOnMethods = "initImpl")
    @Description("Adding a product to cart and verifying product removal after checkout")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 2")
    @Story("Story 1")
    @Owner("Nishant Rawat")
    public void test_to_add_product_to_cart_and_verify_product_removal_after_checkout() {

        stepLog("Verify that correct site is opened");
        cartObject.verifySite();

        stepLog("Get correct details from DOM");
        cartObject.correctUserName("standard_user");
        cartObject.correctPassword("secret_sauce");

        stepLog("Click login button");
        cartObject.clickLogin();

        stepLog("Select a product from the list");
        cartObject.selectProduct();

        stepLog("Add product to cart");
        cartObject.addToCart();

        stepLog("Click cart icon");
        cartObject.clickCart();

        stepLog("Verify product name in cart");
        cartObject.verifyProductName();

        stepLog("Verify product price in cart");
        cartObject.verifyProductPrice();

        stepLog("Click checkout button");
        cartObject.clickCheckout();

        stepLog("Fill the provided form");
        cartObject.enterFirstName("Nishant");
        cartObject.enterLastName("Rawat");
        cartObject.enterPostalCode("121004");

        stepLog("Click continue and finish button ");
        cartObject.clickContinueAndFinish();

        stepLog("Verify product removed");
        cartObject.verifyProductRemoved();
    }
}
