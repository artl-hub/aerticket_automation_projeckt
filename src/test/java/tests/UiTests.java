package tests;

import io.qameta.allure.Owner;
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
import static data.DataAerticket.*;
import static io.qameta.allure.Allure.step;


@Owner("Artem Larichev")
@Tag("positive")
public class UiTests extends TestBase {

    MainPage mainPage = new MainPage();
    FooterComponent footerComponent = new FooterComponent();
    ContactPage contactPage = new ContactPage();
    JobsUndAusbildungPage jobsUndAusbildungPage = new JobsUndAusbildungPage();
    HeaderComponent headerComponent = new HeaderComponent();
    AboutUsPage aboutUsPage = new AboutUsPage();


    @Test
    @DisplayName("Checking switching from \"DE\" to \"EN\" version")
    void switchingFromDeToEnTest() {

        step("Open main page", () -> {
            mainPage.openPage();
        });

        step("Click on \"En\" button", () -> {
            mainPage.clickEnLangButton();
        });

        step("Checking the text on the banner in English", () -> {
            mainPage.checkBannerHeadline("Professional to professional airline tickets");
        });

    }

    @Test
    @DisplayName("Checking contact information on the contact page")
    void checkInfOnContactPageTest() {

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
    @DisplayName("Checking page opening \"Jobs und Ausbildung\"")
    void openJobsAusbildungTest() {

        step("Open \"Jobs und Ausbildung\" page", () -> {
            open("de/jobs-und-ausbildung");
        });

        step("Checking the headline \"Jobs und Ausbildung\" page", () -> {
            jobsUndAusbildungPage.checkHeadline(HEADLINEJOBUNDAUSBILDUNG);
        });
    }

    @Test
    @DisplayName("Checking moving from \"Presse\" to main page when clicking on the logo in header")
    void moveFromPresseToMainTest() {

        step("Open \"Presse\" page", () -> {
            open("de/presse");
        });

        step("Click On Logo in header", () -> {
            headerComponent.clickOnLogo();
        });

        step("Checking headline in main page", () -> {
            mainPage.checkBannerHeadline("Flugtickets von Profis für Profis");
        });
    }


    @Test
    @DisplayName("Checking the opening of the \"Über uns\" page")
    void openAboutAsTest() {

        step("Open \"Über uns\" page", () -> {
            open("de/ueber-uns");
        });

        step("Checking headline in \"Über uns\" page", () -> {
            aboutUsPage.checkBannerHeadline(HEADLINEABOUTUS);
        });

    }

}


