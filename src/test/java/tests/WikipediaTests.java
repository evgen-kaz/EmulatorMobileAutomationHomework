package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screen.EmulatorRealScreen;

@Tag("emulatorOrReal")
public class WikipediaTests extends TestBase {

    EmulatorRealScreen searchScreen = new EmulatorRealScreen();

    @Test
    @Tag("Позитивный")
    @DisplayName("Проверка первого экрана онбординга")
    void successfulCheckingFirstOnPage() {
        searchScreen.checkingTitleOnFirstPage("The Free Encyclopedia\n…in over 300 languages");
        searchScreen.checkingPresenceLanguageSelectionButton();
    }

    @Test
    @Tag("Позитивный")
    @DisplayName("Проверка второго экрана онбординга")
    void successfulCheckingSecondOnPage() {
        searchScreen.clickButtonNext();
        searchScreen.checkingTitleOnFirstPage("New ways to explore");
    }

    @Test
    @Tag("Позитивный")
    @DisplayName("Проверка третьего экрана онбординга")
    void successfulCheckingThirdOnPage() {
        searchScreen.clickButtonNext();
        searchScreen.clickButtonNext();
        searchScreen.checkingTitleOnFirstPage("Reading lists with sync");
        searchScreen.checkingButtonJoinWikipedia();
    }

    @Test
    @Tag("Позитивный")
    @DisplayName("Проверка четвёртого экрана онбординга")
    void successfulCheckingFourthOnPage() {
        searchScreen.clickButtonNext();
        searchScreen.clickButtonNext();
        searchScreen.clickButtonNext();
        searchScreen.checkingTitleOnFirstPage("Data & Privacy");
        searchScreen.checkingPresenceButtonGetStarted();
    }
}

//./gradlew clean browserstack -DdeviceHost=browserstack -DuserName=anna_wau3Mx -DaccessKey=nX6zzGFtSbgVJs5C4sW5
//./gradlew clean emulatorOrReal -DdeviceHost=emulation
//./gradlew clean emulatorOrReal -DdeviceHost=real