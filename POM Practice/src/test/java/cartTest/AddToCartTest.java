package cartTest;

import base.BaseTest;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_functions.*;

public class AddToCartTest extends BaseTest {

    DashboardImpl dashboard;
    CartImpl cart;
    SelectedProductImpl selectedProduct;
    CheckoutInfoImpl checkoutInfo;
    CheckoutOverviewImpl finishCheckout;
    CheckoutCompleteImpl checkoutComplete;

    @Test
    @Description("Test to add a product to cart, verify it and proceed to checkout. After checkout, also verify its removal")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 1")
    @Story("Story 1")
    @Owner("Nishant Rawat")
    public void test_to_login_add_product_to_cart_checkout_and_verify_product_removal() {

        stepLog("Verify correct site is opened");
        loginImpl.verifySite();

        stepLog("Enter credentials to login and click login");
        dashboard = loginImpl.enterCredentials();

        stepLog("Selecting a product");
        selectedProduct = dashboard.selectProduct();

        stepLog("Adding product to cart");
        selectedProduct.saveProductDetails();
        selectedProduct.addToCart();
        cart = selectedProduct.clickOnCart();

        stepLog("Verifying cart product with selected product");
        Assert.assertTrue(cart.verifyProduct());
        checkoutInfo = cart.clickCheckout();

        stepLog("Filling information for checkout");
        checkoutInfo.enterCheckoutDetails();
        finishCheckout = checkoutInfo.clickContinue();

        stepLog("Confirming and finishing checkout process");
        dashboard = checkoutComplete.clickBackHome();

        stepLog("Go to cart and verify product removal");
        cart = dashboard.goToCart();

        stepLog("Checking whether the product is removed");
        cart.checkProductRemoval();
    }
}
