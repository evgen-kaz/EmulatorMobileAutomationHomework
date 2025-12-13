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
            searchScreen.checkingPresenceLanguageSelectionButton();
            searchScreen.clickButtonNext();
            searchScreen.checkingTitleOnSecondPage();
            searchScreen.clickButtonNext();
            searchScreen.checkingButtonJoinWikipedia();


    }
}

//./gradlew clean test -DdeviceHost=emulation
//./gradlew clean test -DdeviceHost=real
