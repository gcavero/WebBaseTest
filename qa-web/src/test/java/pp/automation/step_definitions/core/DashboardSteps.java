package pp.automation.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manage_page.BasePage;
import manage_page.DashboardPage;
import manage_page.OnBoardingPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class DashboardSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(BasePage.class.getSimpleName());

    private DashboardPage dashboardPage;

    public DashboardSteps(final DashboardPage dashboardPage) {
        this.dashboardPage = dashboardPage;
    }

    @Then("The Dashboard page is displayed")
    public void theDashboardPageIsDisplayed() {
        Assert.assertTrue(this.dashboardPage.isDisplayed(), "The Success Message is not displayed");
    }

    @When("I log out from username menu")
    public void iLogOutFromUsernameMenu() {
        this.dashboardPage.logoutPage();
    }

    @When("I open settings from username menu")
    public void iOpenSettingsFromUsernameMenu() {
        this.dashboardPage.openSettingsFromAvatarMenu();
    }
}
