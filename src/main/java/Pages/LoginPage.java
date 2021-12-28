package Pages;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import utilities.TestData;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class LoginPage extends PageBase{
    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "flipboard.app:id/account_login_email_button")
    MobileElement loginMailBtn;
    public void clickLoginMailBtn(){
        click(loginMailBtn);
    }

    @AndroidFindBy(id = "flipboard.app:id/account_login_google_button")
    MobileElement loginGoogleBtn;
    public void clickLoginGoogleBtn(){
        click(loginGoogleBtn);
    }

    @AndroidFindBy(id = "flipboard.app:id/account_login_facebook_button")
    MobileElement loginFacebookBtn;
    public void clickLoginFacebookBtn(){
        click(loginFacebookBtn);
    }

    @AndroidFindBy(id = "flipboard.app:id/account_login_twitter_button")
    MobileElement loginTwitterBtn;
    public void clickLoginTwitterBtn(){
        click(loginTwitterBtn);
    }



    @AndroidFindBy(xpath = "//*[@text='tm.qups@gmail.com']")
    MobileElement gmailAccount;
    public void clickGmailAccount(){
        click(gmailAccount);
    }

    @AndroidFindBy(id = "flipboard.app:id/account_login_password")
    MobileElement passwordField;
    public void fillPasswordField(){
        sendText(passwordField,TestData.GmailPass);
    }
    @AndroidFindBy(id = "flipboard.app:id/account_login_email_next_button")
    MobileElement loginBtn;
    public void clickLoginBtn(){
        click(loginBtn);
    }

    public void ScrollForGoogle(){
        AndroidTouchAction action = new AndroidTouchAction(driver);

        AndroidElement androidElement = (AndroidElement) driver.findElements(By.xpath("//*[@text='Make sure you trust Flipboard']"));
        action.press(ElementOption.element(androidElement))
                .waitAction()
                .moveTo(PointOption.point(100,600))
                .release()
                .perform();
    }

    @AndroidFindBy(xpath = "//*[@text='Allow']")
    MobileElement loginAllowBtn;
    public void clickLoginAllowBtn() {
        click(loginAllowBtn);
    }

    @AndroidFindBy(xpath = "//*[@text='Continue']")
    MobileElement fbContinueBtn;
    public void clickFbContinueBtn() {
        click(fbContinueBtn);
    }

    @AndroidFindBy(id = "cancel")
    MobileElement tweeterCancelBtn;
    public void clickTweeterCancelBtn() {
        click(tweeterCancelBtn);
    }

    @AndroidFindBy(xpath = "//*[@text='Skip for Now']")
    MobileElement loginSkipBtn;
    public void clickLoginSkipBtn() {
        click(loginSkipBtn);
    }
}
