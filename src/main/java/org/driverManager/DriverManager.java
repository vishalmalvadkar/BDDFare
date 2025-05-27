package org.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver driverSetUp(String browser) {
        try {
            switch (browser) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("invalid browser name");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }

        return driver;
    }
}
