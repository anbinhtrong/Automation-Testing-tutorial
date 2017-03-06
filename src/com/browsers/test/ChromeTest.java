package com.browsers.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by TamChieu on 3/6/2017.
 */
public class ChromeTest {
    public void callIt(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
    }
}
