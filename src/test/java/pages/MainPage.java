package pages;


import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;


public class MainPage extends TestBase {


    private final SelenideElement
            bannerHeadline = $("div.col.align-self-start.aer-banner-text > h2"),
            enLangButton =$x("//a[contains(.,'EN')]");

    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    public MainPage clickEnLangButton() {
        enLangButton.click();

        return this;
    }

    public MainPage checkBannerHeadline(String value) {
        bannerHeadline.shouldHave(text(value));
        return this;
    }





}

