package pp.automation.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manage_page.BasePage;
import manage_page.LoginPage;
import manage_page.SignUpPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.PropertyAccessor;

import java.util.Map;

public class SignUpLoginSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(BasePage.class.getSimpleName());

    private SignUpPage signUpPage;
    private LoginPage loginPage;

    private String sigUpUrl = PropertyAccessor.getInstance().getSignUpUrl();

    public SignUpLoginSteps(final SignUpPage signUpPage, final LoginPage loginPage) {
        this.signUpPage = signUpPage;
        this.loginPage = loginPage;
    }

    @Given("I go to SIGN UP page")
    public void iGoToSIGNUPPage() {
        this.navigateTo(sigUpUrl);
    }

    @When("Click on Sing up button")
    public void clickOnSingUpButton() {
        this.signUpPage.clickSignUpButton();
    }

    @And("I signup with the following credentials:")
    public void iFillOutTheFollowingFields(Map<String, String> fields) {
        this.signUpPage.signUpWith(fields.get("Email"), fields.get("Password"));
    }

    @Then("The login page is displayed")
    public void theLoginPageIsDisplayed() {
        this.loginPage.isDisplayed();
    }

    @And("I login with the following credentials:")
    public void iLoginWithTheFollowingCredentials(Map<String, String> fields) {
        this.loginPage.loginWith(fields.get("Email"), fields.get("Password"));
    }
}
