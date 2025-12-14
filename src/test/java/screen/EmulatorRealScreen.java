package screen;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class EmulatorRealScreen {

    SelenideElement

            titleOnPage = $(id("org.wikipedia.alpha:id/primaryTextView")),
            languageSelectionButton = $(id("org.wikipedia.alpha:id/addLanguageButton")),
            nextButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            buttonGetStarted = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")),
            buttonJoinWikipedia = $(id("org.wikipedia.alpha:id/secondaryTextView"));

    @Step("Проверка наличия заголовка на странице")
    public void checkingTitleOnFirstPage(String text) {
        Assertions.assertThat(titleOnPage.getText()).as("Текст элемента").contains(text);
    }

    @Step("Проверка наличия кнопки выбора языка")
    public void checkingPresenceLanguageSelectionButton() {
        languageSelectionButton.shouldHave(visible);
    }

    @Step("Переход на следующую страницу")
    public void clickButtonNext() {
        nextButton.click();
    }

    @Step("Проверка наличия кнопки 'Join Wikipedia'")
    public void checkingButtonJoinWikipedia() {
        buttonJoinWikipedia.shouldHave(visible);
    }

    @Step("Проверка наличия кнопки 'Get Started'")
    public void checkingPresenceButtonGetStarted() {
        buttonGetStarted.shouldHave(visible);
    }
}


