package pp.automation.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manage_page.BasePage;
import manage_page.OnBoardingPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class OnBoardingSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(BasePage.class.getSimpleName());

    private OnBoardingPage onBoardingPage;

    public OnBoardingSteps(final OnBoardingPage onBoardingPage) {
        this.onBoardingPage = onBoardingPage;
    }

    @Then("OnBoarding page is displayed")
    public void onboardingPageIsDisplayed() {
        Assert.assertTrue(this.onBoardingPage.isDisplayed(),"The Page is not displayed");
    }

    @When("I click on CloudApp logo")
    public void iClickOnCloudAppLogo() {
        this.onBoardingPage.clickOnLogo();
    }

    @And("The success message is displayed")
    public void theSuccessMessageIsDisplayed() {
        Assert.assertTrue(this.onBoardingPage.isSuccessMessageDisplayed(),
                "The Success Message is not displayed");
    }
}
