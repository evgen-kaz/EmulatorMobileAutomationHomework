package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screen.SearchScreen;

public class SearchTests extends TestBase {

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @Tag("Позитивный")
    @DisplayName("Поиску по слову 'Test'")
    void successfulSearchTest() {
            searchScreen.clickInputSearch();
            searchScreen.inputTextInSearchInput("Testing");
            searchScreen.searchInputByText();
            searchScreen.checkResultSearchText();
            searchScreen.clickFirstArticle();
            searchScreen.openPageArticle();
    }
}

//./gradlew clean test -DdeviceHost=emulation
//./gradlew clean test -DdeviceHost=real
//./gradlew clean test -DdeviceHost=browserstack