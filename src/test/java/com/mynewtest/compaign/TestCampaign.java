package com.mynewtest.compaign;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.mynewtest.compaign.Pages.Main_Page;
import com.mynewtest.compaign.Pages.SignUp_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Before;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class TestCampaign {
    @BeforeMethod
    public void BeforeStart(){
        Configuration.baseUrl = "https://urancompany.com/";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.reportsFolder = "target/screenshots";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @Test(description = "Test main", enabled = true)
    public void my_test1() {

        open("/");
        sleep(10000);
        String pngFileName = screenshot("Site_page");

    }
}
