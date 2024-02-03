package parallel;

import com.pages.BusinessPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.sql.Driver;

public class BusinessPageStep {

    BusinessPage businessPage = new BusinessPage(DriverFactory.getDriver());


    @Then("user should be redirected to business page")
    public void userShouldBeRedirectedToBusinessPage() {
        String title=  businessPage.getBusinessPageTitle();
        Assert.assertEquals(title,"Business | can-new-cybage");
    }
}
