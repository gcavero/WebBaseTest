package manage_page;

import commons.CommonInteractions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(className = "record-video")
    private WebElement recordVideo;

    @FindBy(id = "avatar")
    private WebElement avatarMenu;


    public boolean isDisplayed(){
        return CommonInteractions.isElementDisplayed(recordVideo);
    }

    public void logoutPage() {
        this.clickOnUsernameDropdown();
        this.clickOnSignOut();
    }

    public void clickOnUsernameDropdown(){
        CommonInteractions.click(avatarMenu);
    }

    public void clickOnSignOut(){
        CommonInteractions.click(CommonInteractions.getWebElementWithCss("[href='/logout']"));
    }

    public void openSettingsFromAvatarMenu() {
        this.clickOnUsernameDropdown();
        CommonInteractions.click(CommonInteractions.getWebElementWithCss("[href*='/settings#profile']"));
    }
}
