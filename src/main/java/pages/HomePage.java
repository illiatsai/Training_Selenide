package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;


public class HomePage {
    private static final By SEARCH_FIELD = By.id("search_from_str");
    private static final By SEARCH_BUTTON = By.cssSelector(".button.big");

    public static void search(WebDriver driver, String searchStr) {
        $(SEARCH_FIELD).sendKeys(searchStr);
        $(SEARCH_BUTTON).click();
    }

}
