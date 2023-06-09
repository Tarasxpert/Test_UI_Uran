package com.mynewtest.compaign.Pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUp_Page {
    public SignUp_Page Fullfill (String name, String company, String phone, String email, String password){
        $(By.name("fullname")).setValue(name);
        $(By.name("company")).setValue(company);
        $(By.name("phone")).setValue(phone);
        $(By.name("email")).setValue(email);
        $(By.name("password")).setValue(password);
        return this;
    }
    public SignUp_Page Checkbox(){
        $(By.cssSelector("#mainControllerContext > div.split-signup-page-content > table > tbody > tr:nth-child(1) > td.split-signup-page-content-primary > div > form > table > tbody > tr > td:nth-child(1) > input")).click();
        return this;
    }
    @Step("Pressing Next button")
    public SignUp_Page NextButton(){
        $(By.id("signup_register_next_button")).shouldBe(Condition.visible);
        return this;
    }
    public SignUp_Page CheckIfTextHave(String text){
        $(By.id("error_text")).shouldHave(Condition.text(text));
        return this;
    }

}
