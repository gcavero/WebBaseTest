package pp.automation.support;

import driver_manager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import manage_page.DashboardPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;

public class Hooks {

    private static final Logger LOGGER = LogManager.getLogger(Hooks.class.getSimpleName());


    /**
     * Hook to logout.
     *
     * @param scenario executed.
     */
    @After("@logout")
    public void logoutHook(final Scenario scenario) {
        LOGGER.info("Logout Page after scenario " + scenario.getName() + " with tags "
                + scenario.getSourceTagNames());
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.logoutPage();
    }

    @AfterSuite
    public void afterFeature() {
        DriverManager.getInstance().closeDriver();
        DriverManager.getInstance().quitDriver();
    }
}
