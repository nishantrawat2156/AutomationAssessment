package page_ors;

import org.openqa.selenium.By;

public class ShopCartPage {

    public static final By Dresses = By.xpath("//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title= 'Dresses']");
    public static final By CasualDresses = By.xpath("//ul[@class = 'tree dynamized']/li/a[contains( text(), 'Casual Dresses' )]");
    public static final By Product = By.xpath("//a[@class = 'product_img_link']/img");
    public static final By ProductName = By.xpath("//h1[@itemprop = 'name']");
    public static final By ProductPrice = By.id("our_price_display");
    public static final By CartProductName = By.xpath("//td[@class = 'cart_description']/p/a");
    public static final By CartProductPrice = By.id("product_price_3_13_0");
    public static final By AddToCart = By.xpath("//button/span[contains(text(), \"Add to cart\")]");
    public static final By PopupCross = By.xpath("//div[@class= 'layer_cart_product col-xs-12 col-md-6']/span");
    public static final By Card_btn = By.xpath("//a[@title = 'View my shopping cart']/b");
    public static String ProdTextName;
    public static String ProdTextPrice;
}
