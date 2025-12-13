package screen;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchScreen {

    SelenideElement
            languageSelectionButton = $(id("org.wikipedia.alpha:id/addLanguageButton")),
            nextButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            titleOnSecondPage = $(id("org.wikipedia.alpha:id/primaryTextView")),
            buttonJoinWikipedia = $(id("org.wikipedia.alpha:id/secondaryTextView")),





            inputSearch = $(accessibilityId("Search Wikipedia")),
            titleInTheArticle = $(id("Text"));




    ElementsCollection
            resultSearch = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Проверка наличия кнопки выбора языка")
    public void checkingPresenceLanguageSelectionButton() {
        nextButton.shouldHave();
    }

    @Step("Переход на следующую страницу")
    public void clickButtonNext() {
        languageSelectionButton.shouldHave();
    }

    @Step("Проверка наличия заголовка на второй странице")
    public void checkingTitleOnSecondPage() {
        titleOnSecondPage.shouldHave();
    }

    @Step("Проверка наличия кнопки 'Join Wikipedia'")
    public void checkingButtonJoinWikipedia() {
        buttonJoinWikipedia.shouldHave();
    }










    /*@Step("Ввод слова 'Test' в поисковую строку")
    public void inputTextInSearchInput(String text) {
        inputForSearchText.sendKeys(text);
    }

    @Step("Поиск по введенному слову")
    public void searchInputByText() {
        inputForSearchText.sendKeys(Keys.ENTER);
    }

    @Step("Проверка наличия искомого текста в результатах поиска")
    public void checkResultSearchText() {
        resultSearch.shouldHave(sizeGreaterThan(0));
    }

    @Step("Клик по первому найденному эелементу")
    public void clickFirstArticle() {
        resultSearch.get(0).click();
    }

    @Step("Открытие первой статьи")
    public void openPageArticle() {
        titleInTheArticle.shouldHave();*/
    }
