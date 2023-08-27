package utils;

import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Utils extends BasePage {
    public Utils(WebDriver driver) {
        super(driver);
    }

    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
