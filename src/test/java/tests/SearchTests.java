package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screen.SearchScreen;

@Tag("browserstack")
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
