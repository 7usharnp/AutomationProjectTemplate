package parallel;

import com.pages.TestimonialPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestimonialsPageStep {
    TestimonialPage testimonialPage = new TestimonialPage(DriverFactory.getDriver());

    @Then("user should be redirected to Testimonial page")
    public void user_should_be_redirected_to_testimonial_page() {
        Assert.assertEquals(testimonialPage.getTestimonialPageTitle(),"Testimonials | can-new-cybage");
    }

}
