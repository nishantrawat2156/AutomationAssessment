package page_repositories;

import org.openqa.selenium.By;

public class CartPage {

    public static final By Cart_Product_Name = By.xpath("//div[@class= 'inventory_item_name']");
    public static final By Cart_Product_Price = By.xpath("//div[@class= 'inventory_item_price']");
    public static final By Checkout_Button = By.id("checkout");
}
