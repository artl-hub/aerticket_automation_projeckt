package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    @BeforeAll static void beforAll() {
        Configuration.baseUrl = "https://www.aerticket.de/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;

     }



}
