package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Keys;
import utilities.TestData;

public class PostPage extends PageBase{

    public PostPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(id = "flipboard.app:id/package_item_action_bar_like")
    MobileElement likeBtn;
    public void clickLikeBtn(){
        click(likeBtn);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"More\"])[1]")
    MobileElement moreBtn;
    public void clickMoreBtn(){
        click(moreBtn);
    }



    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
    MobileElement showLessBtn;
    public void clickShowLessBtn(){
        click(showLessBtn);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")
    MobileElement mutePostBtn;
    public void clickMutePostBtn(){
        click(mutePostBtn);
    }


    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Flip into Magazine\"])[3]")
    MobileElement flipBtn;
    public void clickFlipBtn(){
        click(flipBtn);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    MobileElement createMagazineBtn;
    public void clickCreateMagazineBtn(){
        click(createMagazineBtn);
    }
    @AndroidFindBy(id = "flipboard.app:id/create_magazine_title")
    MobileElement nameYourMagazineField;
    public void fillNameYourMagazineField(){
        sendText(nameYourMagazineField, TestData.TITLE);
    }
    @AndroidFindBy(id = "flipboard.app:id/create_magazine_description")
    MobileElement descYourMagazineField;
    public void fillDescYourMagazineField(){
        sendText(descYourMagazineField, TestData.DESC);
    }
    @AndroidFindBy(id = "flipboard.app:id/create_magazine_privacy_toggle")
    MobileElement privateBtn;
    public void clickPrivateBtn(){
        click(privateBtn);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Share\"])[3]")
    MobileElement shareBtn;
    public void clickShareBtn(){
        click(shareBtn);
    }
    @AndroidFindBy(xpath = "//*[@text='News Feed']")
    MobileElement shareOnFaceBookBtn;
    public void clickShareOnFaceBookBtn(){
        click(shareOnFaceBookBtn);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")
    MobileElement viewOnWebBtn;
    public void clickViewOnWebBtn(){
        click(viewOnWebBtn);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]")
    MobileElement copyLinkBtn;
    public void clickCopyLinkBtn(){
        click(copyLinkBtn);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]")
    MobileElement saveImageToDeviceBtn;
    public void clickSaveImageToDeviceBtn(){
        click(saveImageToDeviceBtn);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]")
    MobileElement reportBtn;
    public void clickReportBtn(){
        click(reportBtn);
    }


    @AndroidFindBy(id = "flipboard.app:id/menu_share_system")
    MobileElement sharePostBtn;
    public void clickSharePostBtn(){
        click(sharePostBtn);
    }
    @AndroidFindBy(id = "flipboard.app:id/menu_flip")
    MobileElement flipPostBtn;
    public void clickFlipPostBtn(){
        click(flipPostBtn);
    }
    @AndroidFindBy(id = "flipboard.app:id/menu_like")
    MobileElement likePostBtn;
    public void clickLikePostBtn(){
        click(likePostBtn);
    }
    @AndroidFindBy(id = "flipboard.app:id/menu_comment")
    MobileElement commentPostBtn;
    public void clickCommentPostBtn(){
        click(commentPostBtn);
    }

    @AndroidFindBy(id = "flipboard.app:id/menu_reader_view_mode")
    MobileElement readPostBtn;
    public void clickReadPostBtn(){
        click(readPostBtn);
    }
    @AndroidFindBy(id = "flipboard.app:id/comments_input")
            MobileElement commentField;
    public void FillCommentField(){
        sendText(commentField,TestData.Comment);
    }
    @AndroidFindBy(id = "flipboard.app:id/comments_input")
    MobileElement commentBtn;
    public void clickCommentBtn(){
        click(commentBtn);
    }
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    MobileElement morePostBtn;
    public void clickMorePostBtn(){
        click(morePostBtn);
    }
    @AndroidFindBy(xpath = "//*[@text='Save Image to Device']")
    MobileElement morePostSaveImageBtn;
    public void clickMorePostSaveImageBtn(){
        click(morePostSaveImageBtn);
    }

    @AndroidFindBy(id = "flipboard.app:id/package_item_action_bar_overflow")
    MobileElement moreOptionBtn;
    public void clickmoreOptionBtn(){
        click(moreOptionBtn);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    MobileElement moreOptionViewWebBtn;
    public void clickMoreOptionViewWebBtn(){
        click(moreOptionViewWebBtn);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    MobileElement moreOptionPostBtn;
    public void clickMoreOptionPostBtn(){
        click(moreOptionPostBtn);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    MobileElement showLessPostBtn;
    public void clickShowLessPostBtn(){
        click(showLessPostBtn);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    MobileElement reportPostBtn;
    public void clickReportPostBtn(){
        click(reportPostBtn);
    }


    @AndroidFindBy(id = "flipboard.app:id/follow_button_internal")
    MobileElement followBtn;
    public void clickFollowBtn(){
        click(followBtn);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"explore\"]")
    MobileElement searchBtn;
    public void clickSearchBtn(){
        click(searchBtn);
    }

    @AndroidFindBy(id = "flipboard.app:id/search_box_place_holder")
    MobileElement searchField;
    public void clickSearchField(){
        click(searchField);

    }

    @AndroidFindBy(id = "flipboard.app:id/search_view_input")
    MobileElement searchField2;
    public void FillSearchField(){
        sendText(searchField2,TestData.Search);
        sendText(searchField2, String.valueOf(Keys.ENTER));
    }


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Notifications\"]")
    MobileElement notificationBtn;
    public void clickNotificationBtn(){
        click(notificationBtn);
    }

}
