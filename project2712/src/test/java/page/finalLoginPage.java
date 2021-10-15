package page;

import base.finalBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.security.util.Password;

public class finalLoginPage extends finalBase {
    public finalLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "username") WebElement userNameField;
    public @FindBy(id = "password") WebElement passwordField;
    public @FindBy(css = ".fa.fa-2x.fa-sign-in") WebElement loginButton;
    public @FindBy(id = "flash-messages") WebElement successfulLogoutMessage;

    public boolean successfulLogoutMessageDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(successfulLogoutMessage));
        return successfulLogoutMessage.isDisplayed();
    }

    public String successfulLogoutMessageMessageText() {
        wdwait.until(ExpectedConditions.visibilityOf(successfulLogoutMessage));
        return successfulLogoutMessage.getText();
    }
    public void inputUserNameField(String Name) {
        wdwait.until(ExpectedConditions.visibilityOf(userNameField));
        userNameField.clear();
        userNameField.sendKeys(Name);
    }
    public void inputPasswordField(String Password) {
        wdwait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(Password);
    }
    public void inputLoginButton() {
        wdwait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }
}
