package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.awt.*;

public class TopicPage extends PageBase{
    public TopicPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(xpath = "//*[@text='# NEWS']")
    MobileElement newsTopicBtn;

    public void clickNewsTopicBtn(){
        click(newsTopicBtn);
    }
    @AndroidFindBy(xpath = "//*[@text='# TECHNOLOGY']")
    MobileElement technologyTopicBtn;

    public void clickTechnologyTopicBtn(){
        click(technologyTopicBtn);
    }
    @AndroidFindBy(xpath = "//*[@text='# SPORTS']")
    MobileElement sportsTopicBtn;

    public void clickSportsTopicBtn(){
        click(sportsTopicBtn);
    }

    @AndroidFindBy(id = "flipboard.app:id/topic_picker_continue_button")
    MobileElement continueBtn;
    public void clickContinueBtn(){
        click(continueBtn);
    }

    @AndroidFindBy(id = "flipboard.app:id/topic_picker_login_button")
    MobileElement loginBtn;
    public void clickLoginBtn(){
        click(loginBtn);
    }




}
