package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    private static final By RESULTS_LIST = By.className("b-results-list");
    private static final By RESULT = By.cssSelector("h3>a[target]");


    public static boolean checkLinkText(WebDriver driver, String linkText) {
        List<WebElement> linksList = (List<WebElement>) $(RESULT);
        //boolean linkExists = false;

        for (WebElement webElement : linksList) {
            String actualText = webElement.getText();
            if (webElement.getText().equals(linkText)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLinkUrl(WebDriver driver, String linkUrl) {
        ElementsCollection linksList = $(RESULTS_LIST).$$(RESULT);
        //boolean linkExists = false;

        for (WebElement webElement : linksList) {
            if (webElement.getAttribute("href").equals(linkUrl)) {
                return true;
            }
        }
        return false;
    }
}
