package pages.components;

import com.codeborne.selenide.SelenideElement;
import pages.ContactPage;
import pages.MainPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FooterComponent {
    private final SelenideElement
            contactButton = $$(".aer-footer-legal-content > *").get(5);



    public FooterComponent clickOnContact() {
        contactButton.click();
        return this;

    }




}
