package com.findvacancy.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Marchenko on 27.07.2017.
 */
public class MainPage {
    MainPage mainPage = new MainPage();
    private SelenideElement mainLogo = $("body > div > header > ul > li.logo > a");
    private SelenideElement jobsLabel = $("body > div > header > ul > li:nth-child(6) > a");
    private SelenideElement searchField = $("#txtGlobalSearch");

    public MainPage selectJobsPage() {
        mainPage.jobsLabel.click();
        return this;
    }

}
