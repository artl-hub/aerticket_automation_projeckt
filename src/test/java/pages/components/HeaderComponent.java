package pages.components;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HeaderComponent {

    private final SelenideElement
            logoInHeader =  $(" a.aer-desktopNav-link_home");

    public HeaderComponent clickOnLogo () {
        logoInHeader.click();
        return this;
    }

}
