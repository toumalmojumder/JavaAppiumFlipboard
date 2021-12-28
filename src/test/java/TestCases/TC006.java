package TestCases;

import Pages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC006 extends TestBase{
    TopicPage topicPage;
    GetStartedPage getStartedPage;
    LoginPage loginPage;
    PostPage postPage;
    NotificationPage notificationPage;
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
    public void test_Home() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollRight();

        Thread.sleep(3000);
        postPage.ScrollRight();

        Thread.sleep(3000);
        postPage.ScrollRight();

    }
    @Test
    public void test_Follow() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.ScrollDown();

        Thread.sleep(3000);
        postPage.ScrollDown();

        Thread.sleep(3000);
        postPage.ScrollDown();

        postPage.clickFollowBtn();
        tearDown();
    }
    @Test
    public void test_Search() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickSearchBtn();
        postPage.clickSearchField();
        postPage.FillSearchField();
        tearDown();
    }
    @Test
    public void test_Find_friend() throws MalformedURLException, InterruptedException {
        postPage = new PostPage(driver);
        Thread.sleep(9000);
        postPage.clickNotificationBtn();
        notificationPage = new NotificationPage(driver);
        notificationPage.clickFindFriendBtn();
        tearDown();
    }
}
