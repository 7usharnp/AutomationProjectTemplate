package parallel;

import com.pages.LoginPage;
import com.pages.PersonalDetailPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Properties;

public class LoginPageStep {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    ConfigReader configReader = new ConfigReader();
    Properties prop = configReader.init_prop();


    PersonalDetailPage personalDetailPage;
    String actualTitle;
    @Given("user is on Login page")
    public void user_is_on_landing_page() {
        DriverFactory.getDriver()
                .get(prop.getProperty("LoginUrl"));
    }

    @Then("page title is {string}")
    public void page_title_is(String expectedTitle) {
        actualTitle = loginPage.getLandingPageTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("User clicks on create account link")
    public void user_clicks_on_create_account_link() {
       loginPage.UserClicksOnCreateAccountLink();
    }

    @When("user enter username")
    public void user_enter_username() {
       loginPage.enterUsername(prop.getProperty("username"));
    }

    @When("user enter password")
    public void user_enter_password() {
        loginPage.enterPassword(prop.getProperty("password"));
    }

    @Then("user should land on personal detail page")
    public void user_should_land_on_personal_detail_page() {

    }

    @When("clicks on sign in button")
    public void clicks_on_sign_in_button() {
        personalDetailPage = loginPage.clickSubmitBtn();
        String actualTitle = personalDetailPage.getPageTitle();
        String expectedTitle = "can-new-cybage";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @When("user clicks on forgot password link")
    public void user_clicks_on_forgot_password_link() {
     loginPage.userClicksForgotPasswordLink();
    }

    @Then("user should be redirected to forgot password popup should appear")
    public void user_should_be_redirected_to_forgot_password_popup_should_appear() {
        Assert.assertTrue(loginPage.clicksOnPopupEmailInputField());
    }


    @Then("user should get erro validation message {string} below username input field")
    public void userShouldGetErroValidationMessageBelowUsernameInputField(String expected) {
        String actual =loginPage.checkEmailIdInputFieldValidatinMessage();
        Assert.assertEquals(actual,expected);
    }

    @When("clicks on sign in button with empty form")
    public void clicksOnSignInButtonWithEmptyForm() {
        loginPage.clickLoginEmptyForm();
    }

    @And("user should get error validation message {string}  below username input field")
    public void userShouldGetErrorValidationMessageBelowUsernameInputField(String expected) {
          String actual = loginPage.getErrorValidationMsgForPwdField();
          Assert.assertEquals(actual,expected);
    }

    @When("user enter admin username")
    public void userEnterAdminUsername() {
        loginPage.enterUsername(prop.getProperty("adminUsername"));
    }

    @And("user enter admin password")
    public void userEnterAdminPassword() {
        loginPage.enterPassword(prop.getProperty("adminPassword"));
    }
}
