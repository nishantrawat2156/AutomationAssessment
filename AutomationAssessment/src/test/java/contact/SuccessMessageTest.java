package contact;


import core.BasicActionsIntegration;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_functions.ContactPageImpl;

@Epic("EPIC 1")
public class SuccessMessageTest extends BasicActionsIntegration {

    ContactPageImpl contact;

    @Test
    @Description("Creating contactPageImpl objects before class")
    public void initImpl() { contact = new ContactPageImpl(bot); }

    @Test(dependsOnMethods = "initImpl")
    @Description("Verify the error message on entering invalid email address")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 1")
    @Story("Story 1")
    @Owner("Nishant Rawat")
    public void test_to_enter_valid_mail_and_get_success_message(){
        stepLog("Verify correct site is opened");
        contact.verifySite();

        stepLog("Click Contact Us");
        contact.clickContactUs();

        stepLog("Select Customer Service from subject headings");
        contact.customerService();

        stepLog("Enter valid email address, some message and click send");
        contact.enterEmailID("abc@gmail.com");
        contact.enterMessage("This is a testing message!");
        contact.submit();

        stepLog("Verify success message on the screen");
        contact.verifySuccessMessage();
    }
}
