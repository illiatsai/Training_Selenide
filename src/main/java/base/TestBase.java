package base;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Configuration.browser;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;


public class TestBase {
    protected WebDriver driver;
    public static final String FIREFOX = "firefox";
    @BeforeTest
    public void setup() {







        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        open("http://www.tut.by");
    }

    @AfterTest
    public void teardown() {

        close();
    }
}
