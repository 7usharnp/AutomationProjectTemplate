package parallel;

import com.pages.AboutUsPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.sql.SQLOutput;

public class AboutUsPageStep {

    AboutUsPage aboutUsPage = new AboutUsPage(DriverFactory.getDriver());
    String count;
    @Then("user should be redirected to about us page")
    public void userShouldBeRedirectedToAboutUsPage() {
        //missing comment added
      String actual =   aboutUsPage.getAboutUsPageTitle();
        Assert.assertEquals(actual,"About Us | can-new-cybage");
    }

    @And("get global office account count")
    public void getGlobalOfficeAccountCount() {
      System.out.println("Count "+ aboutUsPage.getGlobalOfficeAccountsCount());
      count = aboutUsPage.getGlobalOfficeAccountsCount();
    }

    @Then("is should be {string}")
    public void isShouldBe(String expected_count) {
        Assert.assertEquals(count,expected_count);
    }
}
