package page;

import base.finalBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class finalSecureAreaPage extends finalBase {
    public finalSecureAreaPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "flash-messages") WebElement successfulLoginMessage;
    public @FindBy(xpath = "//i[contains(text(), \"Logout\")]") WebElement logoutButton;

    public boolean successfulLoginMessageDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(successfulLoginMessage));
        return successfulLoginMessage.isDisplayed();
    }

    public String successfulLoginMessageMessageText() {
        wdwait.until(ExpectedConditions.visibilityOf(successfulLoginMessage));
        return successfulLoginMessage.getText();
    }
    public void inputLogoutButton() {
        wdwait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
    }


}
