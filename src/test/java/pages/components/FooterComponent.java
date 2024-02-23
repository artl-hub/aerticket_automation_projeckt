package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class FooterComponent {
    private final SelenideElement
            contactButton = $$(".aer-footer-legal-content > *").get(5);



    public FooterComponent clickOnContact() {
        contactButton.click();
        return this;

    }




}
