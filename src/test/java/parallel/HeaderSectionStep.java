package parallel;

import com.pages.HeaderSection;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HeaderSectionStep {


    HeaderSection headerSection = new HeaderSection(DriverFactory.getDriver());

    @When("user clicks home button")
    public void userClicksHomeButton() {
        headerSection.userClicksHome();
    }



    @When("user clicks business link of header")
    public void userClicksBusinessLinkOfHeader() {
        headerSection.clickBusinessLnkHeader();
    }

    @When("user clicks Testimonial link of header")
    public void userClicksTestimonialLinkOfHeader() {
         headerSection.clickTestimonialLnkHeader();
    }

    @When("user clicks about us link of header")
    public void userClicksAboutUsLinkOfHeader() {
        headerSection.clickAboutUsHeaderLink();

    }

    @When("user click contact link of header")
    public void userClickContactLinkOfHeader() {
        headerSection.clickContactLink();
    }


}
