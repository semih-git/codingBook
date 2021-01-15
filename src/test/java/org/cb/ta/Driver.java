package org.cb.ta;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public abstract class Driver {
    protected static WebDriver driver;

    protected Driver() {
        this.driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome", "webdriver/chromedriver.exe");

        return driver;
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        driver.quit();
    }

}