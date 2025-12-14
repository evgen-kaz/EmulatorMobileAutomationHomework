package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.SelectorDriver;
import helpers.Attach;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = SelectorDriver.chooseDriver();
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void setupConfig() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
        AndroidDriver driver = (AndroidDriver) WebDriverRunner.getWebDriver();
        driver.startRecordingScreen();
    }

    @AfterEach
    void addAttachments() {
        String sessionId = Selenide.sessionId().toString();
        String deviceHost = System.getProperty("deviceHost", "emulation");
        if ("browserstack".equals(deviceHost)) {
            Attach.addVideo(sessionId);
        } else {
            Attach.appiumVideo();
        }
        System.out.println(sessionId);
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        closeWebDriver();
    }

    @BeforeAll
    static void cleanAllureResults() {
        try {
            Path results = Paths.get(System.getProperty("user.dir"), "build", "allure-results");

            if (Files.exists(results)) {
                Files.walk(results)
                        .filter(path -> !path.equals(results))
                        .sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
            }
        } catch (Exception e) {
            System.err.println("Failed to clean allure-results: " + e.getMessage());
        }
    }
}