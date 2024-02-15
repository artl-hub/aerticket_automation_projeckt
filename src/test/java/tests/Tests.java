package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AboutUsPage;
import pages.ContactPage;
import pages.JobsUndAusbildungPage;
import pages.MainPage;
import pages.components.FooterComponent;
import pages.components.HeaderComponent;


import static com.codeborne.selenide.Selenide.open;
import static data.DataAboutUsPage.headlineAboutUs;
import static data.DataJobsUndAusbildungPage.headlineJobUndAusbildung;
import static io.qameta.allure.Allure.step;


@Owner("Artem Larichev")
public class Tests extends TestBase {
    /* *Automated 1)Проверка переключения на  английскую версию сайта, а затем снова на немецкую:
               1. Открываем главную страницу https://www.aerticket.de/,

            2. переключаем язык на английский
            3. проверяем наличие слогана на английском: // "Professional to professional airline tickets"

       2) Проверка наличия контактов:
       Checking contact information on the contact page
            1. открываем главную страницу https://www.aerticket.de/
            2. кликаем на кнопку Kontakt
            3. открывается страница контакты https://www.aerticket.de/de/rechtliches/kontakt
            4. Проверяем что на странице контактов присутствуют контактные данные:
        AERTiCKET
      Boppstr. 10, 10967 Berlin

      Tel.: +49-30-69802-144

      E-Mail: vertrieb(at)aer.de bzw. global-sales(at)aer.de (für Agenturen mit Sitz außerhalb Deutschlands)
      Mit Fragen und Feedback zu AERHOTELS wenden Sie sich bitte an: hotelvertrieb(at)aer.de

      ок 3) Проверка открытия страницы jobs
          1. Открыть страницу вакансий https://www.aerticket.de/de/jobs-und-ausbildung
          2. Проверка наличия Текста "Wir suchen dich!"

      ок 4) Проверка редиректа с  на главную с Presse при клике на логотип
          1) открыть страницу https://www.aerticket.de/de/presse
          2) кликнуть на логотип в хедере
          3) проверить что произошел редирект на главную страницу https://www.aerticket.de/

       5) Проверка открытия страницы about us https://www.aerticket.de/de/ueber-uns
          1. перейти на страницу https://www.aerticket.de/de/ueber-uns
          2. проверить наличие текста "Wir sind AERTiCKET"


       6) Проверка перехода на страницу Cocpit  (добавить teg Skiped Сделать статус)
          1. Открыть главную страницу
          2. Кликнуть на кнопку "Cocpit"
          3. Проверка, что на странице "Cocpit": https://cockpit.aerticket.de/en/ отображается надпись "Login"

          Manual
          1. Check banner image
          2. Check the buttons on the banner (color and hover/click effects)
          2. Check the buttons on the banner (color and hover/click effects)

     */

    MainPage mainPage = new MainPage();
    FooterComponent footerComponent = new FooterComponent();
    ContactPage contactPage = new ContactPage();
    JobsUndAusbildungPage jobsUndAusbildungPage = new JobsUndAusbildungPage();
    HeaderComponent headerComponent = new HeaderComponent();
    AboutUsPage aboutUsPage = new AboutUsPage();


    @Test
    @Tag("positive")
    @DisplayName("Checking switching from \"DE\" to \"EN\" version")
    void switchingFromDeToEnTest() {

        step("Open main page", () -> {
            mainPage.openPage();
        });

        step("Click on \"En\" button", () -> {
            mainPage.clickEnLangButton();
        });

        step("Check the text on the banner in English", () -> {
            mainPage.checkBannerHeadline("Professional to professional airline tickets");
        });

    }

    @Test
    @Tag("positive")
    @DisplayName("Checking contact information on the contact page")
    void checkInfOnContactPageTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            mainPage.openPage();
        });

        step("Click on \"Contact\" button and go to the contacts page ", () -> {
            footerComponent.clickOnContact();
        });

        step("Checking contact data on the contact page", () -> {
            contactPage.checkContactData();
        });

    }

    @Test
    @Tag("positive")
    @DisplayName("Checking page opening \"Jobs und Ausbildung\"")
    void openJobsAusbildungTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open \"Jobs und Ausbildung\" page", () -> {
            open("de/jobs-und-ausbildung");
        });

        step("Check the headline \"Jobs und Ausbildung\" page", () -> {
            jobsUndAusbildungPage.checkHeadline(headlineJobUndAusbildung);
        });
    }

    @Test
    @Tag("positive")
    @DisplayName("Check moving from \"Presse\" to main page when clicking on the logo in header")
    void moveFromPresseToMainTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open \"Presse\" page", () -> {
            open("de/presse");
        });

        step("Click On Logo in header", () -> {
            headerComponent.clickOnLogo();
        });

        step("Check headline in main page", () -> {
            mainPage.checkBannerHeadline("Flugtickets von Profis für Profis");
        });
    }


    @Test
    @Tag("positive")
    @DisplayName("Checking the opening of the \"Über uns\" page")
    void openAboutAsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open \"Über uns\" page", () -> {
            open("de/ueber-uns");
        });

        step("Check headline in \"Über uns\" page", () -> {
            aboutUsPage.checkBannerHeadline(headlineAboutUs);
        });

    }

}


