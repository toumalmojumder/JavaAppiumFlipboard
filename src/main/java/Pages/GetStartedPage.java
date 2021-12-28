package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GetStartedPage extends PageBase{
    public GetStartedPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "flipboard.app:id/first_launch_cover_continue")
    MobileElement getStartedBtn;

    public void clickGetStartedBtn(){
        click(getStartedBtn);
    }

}
