package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screen.SearchScreen;

@Owner("Evgenia Zhakova")
@Feature("Поиск статьи по слову 'test'")
@Tag("browserstack")
public class SearchTests extends TestBase {

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @Tag("Позитивный")
    @DisplayName("Поиску по слову 'Testing'")
    void successfulSearchTest() {
            searchScreen.clickInputSearch();
            searchScreen.inputTextInSearchInput("Testing");
            searchScreen.searchInputByText();
            searchScreen.checkResultSearchText();
            searchScreen.clickFirstArticle();
            searchScreen.openPageArticle();
    }
}

//./gradlew clean browserstack -DdeviceHost=browserstack -DuserName=anna_wau3Mx -DaccessKey=nX6zzGFtSbgVJs5C4sW5
