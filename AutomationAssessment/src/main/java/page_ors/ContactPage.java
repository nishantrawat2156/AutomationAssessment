package page_ors;

import org.openqa.selenium.By;

public class ContactPage {

    public static final By ContactUs_button = By.xpath("//div[@id = 'contact-link']/a");
    public static final By SelectService = By.xpath("//select[@id = 'id_contact']/option[@value = '2']");
    public static final By EmailId_text = By.xpath("//input[@id = 'email']");
    public static final By Message_box = By.id("message");
    public static final By Submit_button = By.id("submitMessage");
    public static final By Success_message = By.xpath("//p[contains(text(), 'Your message has been successfully sent to our team.')]");
    public static final By Error_message = By.xpath("//li[contains(text(), 'Invalid email address')]");
}
