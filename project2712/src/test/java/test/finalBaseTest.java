package test;

import base.finalBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.finalLoginPage;
import page.finalSecureAreaPage;

public class finalBaseTest extends finalBase {

        finalLoginPage FinalLoginPage;
        finalSecureAreaPage FinalSecureAreaPage;

    @Before
    public void setUpTest() {
        FinalLoginPage = new finalLoginPage();
        FinalSecureAreaPage = new finalSecureAreaPage();


    }

    @Test
    public void finalInternetSuccessfulTest() {
        FinalLoginPage.inputUserNameField("Milos");
        FinalLoginPage.inputPasswordField("SuperSecretPassword!");
        FinalLoginPage.inputLoginButton();
        Assert.assertTrue(FinalSecureAreaPage.successfulLoginMessageDisplayed());
        Assert.assertEquals("Your username is invalid!\n×",
                FinalSecureAreaPage.successfulLoginMessageMessageText());
        FinalLoginPage.inputUserNameField("tomsmith");
        FinalLoginPage.inputPasswordField("123456789");
        FinalLoginPage.inputLoginButton();
        Assert.assertTrue(FinalSecureAreaPage.successfulLoginMessageDisplayed());
        Assert.assertEquals("Your password is invalid!\n×",
                FinalSecureAreaPage.successfulLoginMessageMessageText());
        FinalLoginPage.inputUserNameField("tomsmith");
        FinalLoginPage.inputPasswordField("SuperSecretPassword!");
        FinalLoginPage.inputLoginButton();
        Assert.assertTrue(FinalSecureAreaPage.successfulLoginMessageDisplayed());
        Assert.assertEquals("You logged into a secure area!\n×",
                FinalSecureAreaPage.successfulLoginMessageMessageText());
        FinalSecureAreaPage.inputLogoutButton();
        Assert.assertTrue(FinalLoginPage.successfulLogoutMessageDisplayed());
        Assert.assertEquals("You logged into a secure area!\n×",true,
                FinalLoginPage.successfulLogoutMessageDisplayed());
    }
}

