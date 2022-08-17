package manage_page;

import commons.CommonInteractions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.StringUtils;
import utils.TimeUtils;

public class SignUpPage extends BasePage {

    @FindBy(id = "email")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "[data-testid='regular-signup-submit']")
    private WebElement signup;

    private void fillUsername(String user) {
        CommonInteractions.fillField(username, user);
    }

    private void fillPassword(String pwd) {
        CommonInteractions.fillField(password, pwd);
    }

    public void clickSignUpButton() {
        CommonInteractions.click(signup);
    }

    public void signUpWith(String user, String pwd) {
        this.fillUsername(StringUtils.setTimeStamp(user));
        this.fillPassword(pwd);
    }
}
