package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static data.DataContactPage.contactDataText;

public class ContactPage {

    protected final SelenideElement contactData = $(".aer-columnModule-content");

    public ContactPage checkContactData() {
        contactData.shouldHave(Condition.text(contactDataText));
        return this;
    }
}
