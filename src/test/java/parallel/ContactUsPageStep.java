package parallel;

import com.pages.ContactUsPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsPageStep {
    ContactUsPage contactUsPage = new ContactUsPage(DriverFactory.getDriver());

    @Then("user should be redirected to contact page")
    public void userShouldBeRedirectedToContactPage() {
        Assert.assertEquals( contactUsPage.getTitleOfThePageForContactUsPage(),"Contact Us | can-new-cybage");
    }

    @When("user submit form empty")
    public void userSubmitFormEmpty() {
        contactUsPage.submitForm();

    }

    @Then("user should get validation message {string} for send to and your message fields.")
    public void userShouldGetValidationMessageForSendToAndYourMessageFields(String expected) {
        Assert.assertEquals(contactUsPage.getSendToInputFieldValidationMsg(),"Please select an item from dropdown list.");
        Assert.assertEquals(contactUsPage.getYourMsgInputFieldValidationMsg(),expected);
    }

    @When("user select option {string} from dropdown")
    public void userSelectOptionFromDropdown(String expected) {
        contactUsPage.selectFromDropdown(expected);
    }

    @And("enter {string} in your message input field")
    public void enterInYourMessageInputField(String msg) {
        contactUsPage.EnterMessage(msg);
    }

    @Then("user should be redirect to success msg")
    public void userShouldBeRedirectToSuccessMsg() {
        Assert.assertTrue(contactUsPage.checkSuccessMessage());
    }

    @And("enter name as {string}")
    public void enterNameAs(String name) {
        contactUsPage.enterName(name);
    }

    @And("click submit button of contact us form")
    public void clickSubmitButtonOfContactUsForm() {
        contactUsPage.submitForm();
    }
}
