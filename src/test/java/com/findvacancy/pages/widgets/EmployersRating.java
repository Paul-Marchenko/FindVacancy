package com.findvacancy.pages.widgets;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Marchenko on 27.07.2017.
 */
public class EmployersRating {
    public void openSection(String sectionName) {
        $(withText(sectionName)).click();

    }


}
