package pp.automation.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manage_page.BasePage;
import manage_page.SettingsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class SettingsSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(BasePage.class.getSimpleName());

    private SettingsPage settingsPage;

    public SettingsSteps(final SettingsPage settingsPage) {
        this.settingsPage = settingsPage;
    }

    @Then("The Setting profile page is displayed")
    public void theSettingProfilePageIsDisplayed() {
        Assert.assertTrue(this.settingsPage.isDisplayed(), "The Page is not displayed");
    }

    @When("I update my full name with: {string}")
    public void iUpdateMyFullNameWith(String fullNameUpdated) {
        this.settingsPage.setFullName(fullNameUpdated);
    }

    @Then("The following message is displayed")
    public void theFollowingMessageIsDisplayed(String messageExpected) {
        Assert.assertEquals(this.settingsPage.getSuccessMessage(), messageExpected);
    }

    @And("I click on Submit")
    public void iClickOnSubmit() {
        this.settingsPage.clickOnSummitButton();
    }
}
