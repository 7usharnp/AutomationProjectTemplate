package parallel;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomePageStep {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    @Then("user should be redirected to home page")
    public void userShouldBeRedirectedToHomePage() {
       String title= homePage.getHomePageTitle();
        Assert.assertEquals(title, "Homepage | can-new-cybage");
    }
}
