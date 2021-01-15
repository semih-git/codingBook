package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public abstract class BaseTest {
    protected final WebDriver driver;
    protected  BaseTest(){
        this.driver = Driver.getDriver();
    }
    @AfterClass
    public void teardown() throws InterruptedException{

    }
}
