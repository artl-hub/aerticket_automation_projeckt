package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AboutUsPage {
    protected final SelenideElement bannerHeadline = $(".aer-banner-headline");

    public AboutUsPage checkBannerHeadline(String value) {
        bannerHeadline.shouldHave(text(value));
        return this;
    }


}

