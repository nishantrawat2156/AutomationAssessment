package page_functions;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_ors.ContactPage;
import utils.BasicActions;

public class ContactPageImpl extends BasicActions {

    public ContactPageImpl(WebDriver bot) {
        super(bot);
    }
/*
1- Open Application
2- Verify correct site is opened
3- Click “Contact Us”
4- Select “Customer Service” from  Subject heading
5- Enter valid email address and add some message and click send
6- Verify Success Message
*/

    @Step("Verifying that correct site is opened")
    public void verifySite() {
        waitForVisibility(ContactPage.ContactUs_button);
        Assert.assertEquals(pageTitle(), "My Store");
    }

    @Step("Clicking on contact us button")
    public void clickContactUs() {      //This is again taking a reference from basic actions!!
        click(ContactPage.ContactUs_button); //ContactPage is a class and we are passing through it to this element
    }

    @Step("Selecting customer service")
    public void customerService() {
        click(ContactPage.SelectService);
    }

    @Step("Entering email address")
    public void enterEmailID(String mail) {
        enterText(ContactPage.EmailId_text, mail);
    }

    @Step("Entering some message")
    public void enterMessage(String message) {
        enterText(ContactPage.Message_box, message);
    }

    @Step("Click on submit button")
    public void submit() {
        click(ContactPage.Submit_button);
    }

    @Step("Verifying success message")
    public void verifySuccessMessage() {
        sleep(1);
        Boolean successElement;
        if (checkElement(ContactPage.Success_message) != false) {
            successElement = true;
        }else{
            successElement = false;
        }
    }

    @Step("Verifying error message")
    public void verifyErrorMessage() {
        sleep(1);
        Boolean errorElement;
        if (checkElement(ContactPage.Error_message) != false) {
            errorElement = true;
        }else{
                errorElement = false;
            }
        }
}


