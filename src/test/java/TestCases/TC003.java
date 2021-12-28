package TestCases;

import Pages.GetStartedPage;
import Pages.LoginPage;
import Pages.TopicPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC003 extends TestBase{
    TopicPage topicPage;
    GetStartedPage getStartedPage;
    LoginPage loginPage;

    @BeforeTest
    public void beforeTests() throws MalformedURLException {
        Android_setUp();
        getStartedPage = new GetStartedPage(driver);
        getStartedPage.clickGetStartedBtn();
        topicPage = new TopicPage(driver);
        topicPage.clickLoginBtn();
    }
    @Test
    public void test_loginByMail() throws MalformedURLException {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginMailBtn();
        loginPage.clickGmailAccount();
        loginPage.fillPasswordField();
        loginPage.clickLoginBtn();
        tearDown();
    }
    @Test
    public void test_loginByGoogle() throws MalformedURLException {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginGoogleBtn();
        loginPage.clickGmailAccount();
        loginPage.ScrollDown();
        loginPage.ScrollDown();
        tearDown();
    }
    @Test
    public void test_loginByFaceBook() throws MalformedURLException {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginFacebookBtn();
        loginPage.clickFbContinueBtn();
        tearDown();
    }
    @Test
    public void test_loginByTweeter() throws MalformedURLException {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginTwitterBtn();
        tearDown();
    }


}
