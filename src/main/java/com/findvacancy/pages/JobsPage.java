package com.findvacancy.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

import static com.codeborne.selenide.Selenide.$;


public class JobsPage extends MainPage {
    public SelenideElement jobsSubCategory = $("#container > div.header > div.b-sub-head-n > div.wrap > ul > li.sel > a");
    //SelenideElement allCategoriesDropDownList = $("#container > div.header > div.b-sub-head-n > div.b-jobs-search > form > select");
    SelenideElement keyWordField = $("#container > div.header > div.b-sub-head-n > div.b-jobs-search > form > span > input");
    SelenideElement findButton = $("#container > div.header > div.b-sub-head-n > div.b-jobs-search > form > input");
    SelenideElement keyWordCheckBox = $("#container > div.header > div.b-sub-head-n > div.b-jobs-search > form > span > label > input[type=\"checkbox\"]");
    SelenideElement jobsLabel = $("#container > div.content-wrap > div > div.row.m-db > div.cell.m-db > div > div.row > div:nth-child(1) > div.b-vacancies-head > div > h1");
    SelenideElement citylabel = $("#container > div.content-wrap > div > div.row.m-db > div.cell.m-db > div > div.row > div:nth-child(3) > div > div > div.tte > h3");
    SelenideElement allCitylabel = $("#container > div.content-wrap > div > div.row.m-db > div.cell.m-db > div > div.row > div:nth-child(3) > div > div > ul.selected > li");
    SelenideElement kyivlabel = $("#container > div.content-wrap > div > div.row.m-db > div.cell.m-db > div > div.row > div:nth-child(3) > div > div > ul.other > li:nth-child(1) > a");
    Select allCategoriesDropDownList = new Select($("#container > div.header > div.b-sub-head-n > div.b-jobs-search > form > select"));
    SelenideElement rating = $("#container > div.header > div.b-sub-head-n > div.wrap > ul > li.rank > a");

    public JobsPage selectCategory(String category) {
        allCategoriesDropDownList.selectByVisibleText(category);
        return this;
    }

    public JobsPage selectByKeyWordsInTheSearchField(String position) {
        keyWordField.setValue(position);
        findButton.click();
        return this;

    }

    public void checkBoxChecked() {
        keyWordCheckBox.click();
    }
}
