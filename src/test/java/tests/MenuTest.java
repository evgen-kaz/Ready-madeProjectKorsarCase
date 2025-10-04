package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import page.MenuPage;

public class MenuTest extends TestBase {
    MenuPage menuPage = new MenuPage();

    @DisplayName("Переход в раздел 'Грузовые перевозки'")
    @Test
    @Tag("Positive")
    void successfulTransitionToTheCargoTransportationPageTest() {
        menuPage.openPage()
                .clickCargoMenu()
                .resultClickCargoMenu();
    }

    @DisplayName("Переход в раздел 'Компания'")
    @Test
    @Tag("Positive")
    void successfulTransitionToTheCompanyPageTest() {
        menuPage.openPage()
                .clickCompanyMenu()
                .resultClickCompanyMenu();
    }

    @DisplayName("Переход в раздел 'Работа в РДЖ'")
    @Test
    @Tag("Positive")
    void successfulTransitionToTheJobInRZDPageTest() {
        menuPage.openPage()
                .clickCareerMenu()
                .resultClickCareerMenu();
    }

    @DisplayName("Переход в раздел 'Контакты'")
    @Test
    @Tag("Positive")
    void successfulTransitionToTheContactsInRZDPageTest() {
        menuPage.openPage()
                .clickContactsMenu()
                .resultClickContactsMenu();
    }

    @DisplayName("Переключение на версию для слабовидящих")
    @Test
    @Tag("Positive")
    void successfulSwitchingToTheVersionForTheBlindTest() {
        menuPage.openPage()
                .clickVersionForBlindMenu()
                .resultClickVersionForBlindMenu();
    }

    @DisplayName("Открытие окна авторизации /регистрации")
    @Test
    @Tag("Positive")
    void successfulOpeningTheAuthorizationAndRegistrationWindowTest() {
        menuPage.openPage()
                .clickLoginMenu()
                .resultClickLoginMenu();
    }

    @DisplayName("Переключение на окно регистрации")
    @Test
    @Tag("Positive")
    void successfulSwitchingToTheRegistrationWindowTest() {
        menuPage.openPage()
                .clickLoginMenu()
                .clickToTheTabRegistration()
                .resultSwitchingRegistrationMenu();
    }

    @DisplayName("Переключение сайта на английскую версию")
    @Test
    @Tag("Positive")
    void successfulSwitchingToTheEnglishVersionTest() {
        menuPage.openPage()
                .switchingEnglishLanguage()
                .resultSwitchingEnglishVersionMenu();
    }
}
