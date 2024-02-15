package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class ClebenArbeitenPage {

    private final SelenideElement bannerHeadline = $(byTagAndText("a","Olaf Schroeder Industrial Design"));

    public ClebenArbeitenPage clickOnDesignLink() {
        bannerHeadline.click();
        return this;
    }



}
