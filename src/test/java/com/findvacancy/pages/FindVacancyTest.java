package com.findvacancy.pages;

import org.testng.annotations.Test;

public class FindVacancyTest extends SelectCategoryTest{
    JobsPage jobsPage = new JobsPage();

    @Test
    public FindVacancyTest postionsDisplay(){
        jobsPage.selectByKeyWordsInTheSearchField("DataArt");
        jobsPage.checkBoxChecked();
        return this;
    }
}
