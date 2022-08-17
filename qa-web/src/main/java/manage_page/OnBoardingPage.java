package manage_page;

import commons.CommonInteractions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.StringUtils;
import utils.TimeUtils;

public class OnBoardingPage extends BasePage {

    @FindBy(className = "cloudapp-logo")
    private WebElement appLogo;

    public boolean isDisplayed() {
        return CommonInteractions.isElementPresent(appLogo);
    }

    public void clickOnLogo() {
        CommonInteractions.click(appLogo);
    }

    public boolean isSuccessMessageDisplayed() {
        WebElement successMessage = CommonInteractions.getWebElementWithCss("#b-toaster-top-center");
        boolean isDisplayed = CommonInteractions.isElementDisplayed(successMessage);
        CommonInteractions.waitUntilElementNotDisplayed(successMessage);
        return isDisplayed;
    }
}
