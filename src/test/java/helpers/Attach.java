package helpers;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Attach {
   /* @Attachment(value = "{attachName}", type = "image/png")
    public static byte[] screenshotAs(String attachName) {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }*/

    @Attachment(value = "Page source", type = "text/plain")
    public static byte[] pageSource() {
        return getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
    }

    @Attachment(value = "{attachName}", type = "text/plain")
    public static String attachAsText(String attachName, String message) {
        return message;
    }

    @Attachment(value = "Video", type = "text/html", fileExtension = ".html")
    public static String addVideo(String sessionId) {
        return "<html><body><video width='100%' height='100%' controls autoplay><source src='"
                + Browserstack.videoUrl(sessionId)
                + "' type='video/mp4'></video></body></html>";
    }

    @Attachment(value = "Video", type = "video/mp4", fileExtension = ".mp4")
    public static byte[] appiumVideo() {
        try {
            AndroidDriver driver = (AndroidDriver) WebDriverRunner.getWebDriver();
            if (driver == null) {
                return new byte[0];
            }

            String base64 = driver.stopRecordingScreen();
            if (base64 == null || base64.isEmpty()) {
                return new byte[0];
            }

            return Base64.getDecoder().decode(base64);

        } catch (Exception e) {
            System.err.println("Failed to attach screen recording: " + e.getMessage());
            return new byte[0];
        }
    }
}
