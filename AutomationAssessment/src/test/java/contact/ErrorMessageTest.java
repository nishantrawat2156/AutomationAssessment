package contact;

import core.BasicActionsIntegration;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_functions.ContactPageImpl;

@Epic("EPIC 1")
    public class ErrorMessageTest extends BasicActionsIntegration{ //Extends meaning it accesses all members of BAI

        ContactPageImpl contacterror; //Bcoz everywork is done by impl class only

        @Test
        @Description("Creating contactPageImpl objects before class")
        public void initImpl() { contacterror = new ContactPageImpl(bot); }

        @Test(dependsOnMethods = "initImpl")
        @Description("Verify the error message on entering invalid email address")
        @Severity(SeverityLevel.CRITICAL)
        @Feature("Feature 1")
        @Story("Story 2")
        @Owner("Nishant Rawat")
        public void test_to_enter_invalid_mail_and_get_error_message() {
            stepLog("Verify correct site is opened");
            contacterror.verifySite();

            stepLog("Click Contact Us");
            contacterror.clickContactUs();

            stepLog("Select customer service from subject headings");
            contacterror.customerService();

            stepLog("Enter invalid email address, some message and click send");
            contacterror.enterEmailID("abcgmail.com");
            contacterror.enterMessage("This is a testing message!");
            contacterror.submit();

            stepLog("Verify error message on the screen");
            contacterror.verifyErrorMessage();
        }

}


