package manage_page;

import commons.CommonInteractions;
import constants.GlobalConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.StringUtils;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "[value='Sign in']")
    private WebElement signInButton;

    private void fillUsername(String user) {
        CommonInteractions.fillField(username, user);
    }

    private void fillPassword(String pwd) {
        CommonInteractions.fillField(password, pwd);
    }

    public void clickSignInButton() {
        CommonInteractions.click(signInButton);
    }

    public void loginWith(String user, String pwd) {
        this.fillUsername(GlobalConstants.get(user));
        this.fillPassword(pwd);
        this.clickSignInButton();
    }

    public boolean isDisplayed() {
        return CommonInteractions.isElementDisplayed(signInButton);
    }
}
