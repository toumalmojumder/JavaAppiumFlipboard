package TestCases;

import Pages.GetStartedPage;
import Pages.LoginPage;
import Pages.PostPage;
import Pages.TopicPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC004 extends TestBase{
    TopicPage topicPage;
    GetStartedPage getStartedPage;
    LoginPage loginPage;
    PostPage postPage;

    @BeforeTest
    public void beforeTests() throws MalformedURLException {
        Android_setUp();
        getStartedPage = new GetStartedPage(driver);
        getStartedPage.clickGetStartedBtn();
        topicPage = new TopicPage(driver);
        topicPage.clickSportsTopicBtn();
        topicPage.clickTechnologyTopicBtn();
        topicPage.clickNewsTopicBtn();
        topicPage.clickContinueBtn();
        loginPage = new LoginPage(driver);
        loginPage.clickLoginFacebookBtn();
    }
    @Test
    public void test_Like() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.ScrollDown();
        postPage.Tap();
        postPage.clickLikeBtn();
        tearDown();
    }
    @Test
    public void test_LessHeart() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.ScrollDown();
        postPage.clickMoreBtn();
        postPage.clickShowLessBtn();
        tearDown();
    }

    @Test
    public void test_Mute_Post() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.ScrollDown();
        postPage.clickMoreBtn();
        postPage.clickMutePostBtn();
        tearDown();
    }

    @Test
    public void test_Flip() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.ScrollDown();
        postPage.clickFlipBtn();
        postPage.clickCreateMagazineBtn();
        postPage.fillNameYourMagazineField();
        postPage.fillDescYourMagazineField();
        postPage.clickPrivateBtn();
        tearDown();
    }
    @Test
    public void test_Share() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.clickShareBtn();

        postPage.clickShareOnFaceBookBtn();
        tearDown();
    }

    @Test
    public void test_View_On_Web() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.clickMoreBtn();
        postPage.clickViewOnWebBtn();
        tearDown();
    }
    @Test
    public void test_copy_link() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.clickMoreBtn();
        postPage.clickCopyLinkBtn();
        tearDown();
    }
    @Test
    public void test_Save_Image() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.clickMoreBtn();
        postPage.clickSaveImageToDeviceBtn();
        tearDown();
    }
    @Test
    public void test_Report() throws MalformedURLException {
        postPage = new PostPage(driver);
        postPage.clickMoreBtn();
        postPage.clickReportBtn();
        tearDown();
    }
}
