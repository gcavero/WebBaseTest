package manage_page;

import commons.CommonInteractions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {

    @FindBy(css = "#avatar.lg")
    private WebElement mainAvatar;

    @FindBy(id = "user_name")
    private WebElement fullName;

    @FindBy(css = "[data-testid='onboarding-submit-about-you-form']")
    private WebElement submit;

    private static final String VIDEO_BASE_PATH = "qa-web/src/test/resources/webImages/";

    public boolean isDisplayed() {
        return CommonInteractions.isElementDisplayed(mainAvatar);
    }

    public void setFullName(String fullNameUpdated) {
        CommonInteractions.fillField(fullName, fullNameUpdated);
    }

    public String getSuccessMessage() {
        return CommonInteractions.getText(CommonInteractions.getWebElementWithCss(".toast-body"));
    }

    public void clickOnSummitButton() {
        CommonInteractions.click(submit);
    }
}
