package parallel;

import com.pages.FooterSection;
import com.pages.HeaderSection;
import com.pages.PersonalDetailPage;
import com.pages.PersonalDetailPage_updateProfilePicPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PersonalDetailsPageStep {

    PersonalDetailPage personalDetailPage = new PersonalDetailPage(DriverFactory.getDriver());
    HeaderSection headerSection;
    FooterSection footerSection;
    PersonalDetailPage_updateProfilePicPage personalDetailPageUpdateProfilePicPage;

    @When("user clicks on reset password link")
    public void user_clicks_on_reset_password_link() throws InterruptedException {
        personalDetailPage.clickResetPwdLink();
    }


    @Then("user should be redirected to reset password popup")
    public void userShouldBeRedirectedToResetPasswordPopup() {

        Assert.assertTrue(personalDetailPage.checkPwdResetPopup());
    }

    @When("user click edit icon on profile picture")
    public void userClickEditIconOnProfilePicture() {
        personalDetailPageUpdateProfilePicPage = personalDetailPage.userClicksOnEditProfileIcon();
    }

    @Then("user should be redirected upload image popup")
    public void userShouldBeRedirectedUploadImagePopup() {

    }

    @And("user moves to header section")
    public void userMovesToHeaderSection() {
        headerSection = personalDetailPage.moveToHeaderSection();

    }


    @And("user moves to footer section")
    public void userMovesToFooterSection() {
        footerSection = personalDetailPage.moveToFooterSection();
    }


    @When("User enter current company to {string}")
    public void userEnterCurrentCompanyTo(String companyName) {
        personalDetailPage.enterCompanyName(companyName);

    }

    @And("User enter current location to {string}")
    public void userEnterCurrentLocationTo(String location) {
        personalDetailPage.enterCurrentLocation(location);
    }

    @And("current Designation to {string}")
    public void currentDesignationTo(String designation) {
        personalDetailPage.enterCurrentDesignation(designation);
    }

    @And("Birthdate to {string}")
    public void birthdateTo(String dob) {
        personalDetailPage.enterDob(dob);
    }

    @And("Gender to {string}")
    public void genderTo(String gender) {
        personalDetailPage.selectGender(gender);
    }


    @And("Marital status to {string} from dropdown")
    public void maritalStatusToFromDropdown(String maritalStatus) {
        personalDetailPage.SelectMaritalStatus(maritalStatus);
    }

    @And("Cybage location to {string} from dropdown")
    public void cybageLocationToFromDropdown(String location) {
        personalDetailPage.enterCurrentLocation(location);
    }

    @And("LinkedIn url to {string}")
    public void linkedinUrlTo(String linkedinurl) {
        personalDetailPage.enterLinkedInId(linkedinurl);
    }

    @And("twitter link to {string}")
    public void twitterLinkTo(String twitterId) throws InterruptedException {
        personalDetailPage.enterTwitterId(twitterId);

    }

    @And("Facebook link to {string}")
    public void facebookLinkTo(String facebookId) {
        personalDetailPage.enterFacebookId(facebookId);
    }

    @Then("user should be redirected to update profile page popup")
    public void userShouldBeRedirectedToUpdateProfilePagePopup() throws InterruptedException {
        Assert.assertTrue(personalDetailPage.checkEditProfilePopup());
    }
}
