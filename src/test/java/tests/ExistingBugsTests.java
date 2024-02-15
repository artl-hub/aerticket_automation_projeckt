package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ClebenArbeitenPage;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


@Owner("Artem Larichev")
public class ExistingBugsTests extends TestBase {
    
    //Возможно сделать ручными тестами
    //1)Редирект  с сleben-arbeiten на https://formatberlin.de/
    //  1.Открыть страницу leben-arbeiten https://www.aerticket.de/de/ueber-uns/leben-arbeiten
    //  2. Кликнуть на ссылку "Olaf Schroeder Industrial Design"
    //  3. Открылась страница без ошибок (На странице не должно быть текста Fatal error)
    //2) Редирект с  Unsere AERKANTINA на на https://formatberlin.de/
    // https://www.aerticket.de/de/ueber-uns/die-aerkantina-gutes-essen-haelt-leib-und-seele-zusammen
    //  1. Открыть страницу Unsere AERKANTINA
    //  2. Кликнуть на ссылку "Olaf Schroeder Industrial Design"
    //  3. Открылась страница без ошибок (На странице не должно быть текста Fatal error)
    //
    //3) Подача заявки на вакансию "Travel Agent"
    //  1.Открыть страницу вакансии https://www.aerticket.de/de/jobs-und-ausbildung/consolidator-sucht-tarifspezialisten/travel-agent-m-w-d-gruppenreisen
    //  2.Кликнуть на кнопку подать заявку
    //  3.Открылась страница вакансии, 404 отсутствует на странице
    //4) Подача заявки на вакансию "Kaufmännischer Angestellter"
    //  1.Открыть страницу вакансии https://www.aerticket.de/de/jobs-und-ausbildung/kaufleute-und-buchhalter-innen-gesucht/kaufmaennischer-angestellter-m-w-d
    //  2.Кликнуть на кнопку подать заявку
    //  3.Открылась страница вакансии, 404 отсутствует на странице

    ClebenArbeitenPage clebenArbeitenPage = new ClebenArbeitenPage();

    @Test
    @Tag("positive")
    @DisplayName("Moving from \"Cleben arbeiten\" to https://formatberlin.de/")
    void moveFromClebenArbeitenTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            open("de/ueber-uns/leben-arbeiten");
        });

        step("Click on design link \"Olaf Schroeder Industrial Design\"", () -> {
            clebenArbeitenPage.clickOnDesignLink();
        });

        // нужно дождаться октрытия страницы, а затем сделать степ

        step("The opened page doesn't contain a \"Fatal Error\" ", () -> {
            $("body").shouldNotHave(text("Fatal error"));
        });


    }


}
