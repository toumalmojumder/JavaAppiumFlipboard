package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NotificationPage extends PageBase{
    public NotificationPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "flipboard.app:id/find_friends_button")
    MobileElement findFriendBtn;
    public void clickFindFriendBtn(){
        click(findFriendBtn);
    }
}
