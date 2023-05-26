package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RepeatedActions {
    public static void deletingAndAddingContentToLabel(WebDriver driver, WebElement webElement, String content) {
        new Actions(driver).click(webElement)
                .pause(100).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .pause(100).sendKeys(Keys.BACK_SPACE)
                .pause(100).sendKeys(content).perform();
    }
}
