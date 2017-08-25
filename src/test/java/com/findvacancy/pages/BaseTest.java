package com.findvacancy.pages;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    @BeforeSuite
    public void setup() {
        ChromeDriverManager.getInstance().setup();
        /*FirefoxDriverManager.getInstance().setup();
        OperaDriverManager.getInstance().setup();
        EdgeDriverManager.getInstance().setup();*/
        Configuration.baseUrl = "https://dou.ua/";
    }
}
