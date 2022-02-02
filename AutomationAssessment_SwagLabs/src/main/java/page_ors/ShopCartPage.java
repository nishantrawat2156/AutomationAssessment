package page_ors;

import org.openqa.selenium.By;

public class ShopCartPage {

    //public static final By DOM_UserName = By.xpath("//div[@id = 'login_credentials']/h4");
    //public static final By DOM_Password = By.xpath("//div[@class = 'login_password']/h4");

    //First we arrive at the login page and add correct credentials
    //This is directly provided by the user
    //The login button to enter
    public static final By Login_button = By.id("login-button");
    //The button to select the desired product
    public static final By Select_Product = By.xpath("//a[@id = 'item_4_title_link']/div");
    //Saving product name for comparison
    public static final By ProductName = By.xpath("//div[@class = 'inventory_details_name large_size']");
    //Saving product price for comparison
    public static final By ProductPrice = By.xpath("//div[@class = 'inventory_details_price']");
    //The button for add to cart
    public static final By AddToCart = By.id("add-to-cart-sauce-labs-backpack");
    //The button for going to cart
    public static final By Cart_button = By.xpath("//div[@id = 'shopping_cart_container']/a");
    //Name of the product in the cart
    public static final By CartProductName = By.xpath("//a[@id = 'item_4_title_link']/div");
    //Price of the product in the cart
    public static final By CartProductPrice = By.xpath("//div[@class = 'inventory_item_price']");
    //The button for checkout
    public static final By Checkout_button = By.id("checkout");

    public static final By ownerFirstName = By.id("first-name");
    public static final By ownerLastName = By.id("last-name");
    public static final By postalCode = By.id("postal-code");
    public static final By continue_button = By.id("continue");
    public static final By finish_button = By.id("finish");
    public static final By backHome_button = By.id("back-to-products");

    public static final By UserName_text = By.id("user-name");
    public static final By Password_text = By.id("password");

    public static String ProdTextName;
    public static String ProdTextPrice;

}
