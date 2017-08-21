package com.findvacancy.pages;

import com.codeborne.selenide.Selenide;

public class LoginPage {
    public LoginPage open(){
        Selenide.open("/");
        return this;
    }
}
