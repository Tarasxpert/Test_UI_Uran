package com.mynewtest.compaign.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class Main_Page {

    public static SignUp_Page signup(){
        //open("/");
        $(By.cssSelector("body > div.header.w-nav > div.header-container.w-container > div.header-wrapper > div.split-content.header-left > a:nth-child(2)")).pressEnter();
        return page(SignUp_Page.class);
    }
}
