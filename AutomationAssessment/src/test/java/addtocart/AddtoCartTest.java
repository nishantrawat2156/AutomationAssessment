package addtocart;


import core.BasicActionsIntegration;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_functions.ShopCartPageImpl;
import io.qameta.allure.*;

@Epic("EPIC 1")
public class AddtoCartTest extends BasicActionsIntegration {

    ShopCartPageImpl shop;

    @Test
    @Description("Creating shopCartPageImpl objects before class")
    public void initImpl() { shop = new ShopCartPageImpl(bot); }

    @Test(dependsOnMethods = "initImpl")
    @Description("Add product to the cart and verify whether the same product has been added or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 2")
    @Story("Story 1")
    @Owner("Nishant Rawat")

    public void add_to_cart_and_verify_name_and_price() {
        stepLog("Click on Dresses and then on Casual Dresses");
        shop.clickDresses();
        shop.clickCasualDresses();

        stepLog("Select one item from result and add to cart");
        shop.selectProduct();
        shop.addToCart();

        stepLog("Close the popup dialog box");
        shop.closePopup();

        stepLog("Open the Cart");
        shop.openCart();

        stepLog("Verify that same product is added to the cart and its price is correct");
        shop.verifyDress();
        shop.verifyPrice();
    }

}
