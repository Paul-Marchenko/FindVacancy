package com.findvacancy.pages;

import com.findvacancy.pages.JobsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;

public class SelectCategoryTest {
    JobsPage jobsPage = new JobsPage();
    @Test
    public void categotyselected(){
        jobsPage.selectCategory("QA");
        Assert.assertEquals(jobsPage.selectCategory("QA"), "QA");

    }
}
