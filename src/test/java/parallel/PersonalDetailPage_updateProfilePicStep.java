package parallel;

import com.pages.PersonalDetailPage_updateProfilePicPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PersonalDetailPage_updateProfilePicStep {

    PersonalDetailPage_updateProfilePicPage personalDetailPage_updateProfilePicPage = new PersonalDetailPage_updateProfilePicPage(DriverFactory.getDriver());
    @When("user submit empty edit profile form")
    public void user_submit_empty_edit_profile_form() {
      personalDetailPage_updateProfilePicPage.submitEmptyPopupForm();
    }

    @Then("user should get error validation message")
    public void userShouldGetErrorValidationMessage() {
        Assert.assertEquals( personalDetailPage_updateProfilePicPage.checkEmptyFormValidation(),"field is required.");
    }

    @When("user gives image greater than {int} mb size")
    public void userGivesImageGreaterThanMbSize(int arg0) throws InterruptedException {
        personalDetailPage_updateProfilePicPage.uploadImage("\"C:\\Users\\tusharnan\\Downloads\\pexels-craig-adderley-1563356.jpg\"");
    }


}
