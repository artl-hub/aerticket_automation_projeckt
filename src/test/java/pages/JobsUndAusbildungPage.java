package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class JobsUndAusbildungPage {

private final SelenideElement  bannerHeadline = $(".aer-banner-headline");

public JobsUndAusbildungPage checkHeadline(String value) {
    bannerHeadline.shouldHave(text(value));
    return this;
}


}


