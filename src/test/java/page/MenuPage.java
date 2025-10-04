package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MenuPage {
    private final SelenideElement
            cargoMenu = $(withTagAndText("a", "Грузовые перевозки")),
            companyMenu = $(withTagAndText("a", "Компания")),
            careerMenu = $(withTagAndText("a", "Работа в РЖД")),
            contactsMenu = $(withTagAndText("a", "Контакты")),
            versionForBlindMenu = $(".header_specials").$(".blind__text"),
            loginMenu = $("[data-test-id='profile']"),

            cargoResult = $(byText("Рассчитать перевозку")),
            companyResult = $(".block-group-header").$(byText("Структура")),
            careerResult = $(byText("Рассчитать перевозку")),
            contactsResult = $(byText("Контакты")),
            versionForTheBlindResult = $("#header").$(byText("Обычная версия сайта")),
            buttonAuthorization = $(withTagAndText("button", "Войти")),
            tabRegistration = $("[data-test-id='tab-registration']"),
            buttonRegistration = $("[data-test-id='registration-register']"),
            languageRussian = $(".header_specials").$(byText("Rus")),
            languageEnglish = $(withTagAndText("a", "Eng")),
            englishElement = $(withTagAndText("a", "Railway stations in Russia"));


    public MenuPage openPage() {
        open("");
        return this;
    }

    public MenuPage clickCargoMenu() {
        cargoMenu.click();
        return this;
    }

    public MenuPage clickCompanyMenu() {
        companyMenu.click();
        return this;
    }

    public MenuPage clickCareerMenu() {
        careerMenu.click();
        return this;
    }

    public MenuPage clickContactsMenu() {
        contactsMenu.click();
        return this;
    }

    public MenuPage clickVersionForBlindMenu() {
        versionForBlindMenu.click();
        return this;
    }

    public MenuPage clickLoginMenu() {
        loginMenu.click();
        return this;
    }

    public MenuPage clickToTheTabRegistration() {
        tabRegistration.click();
        return this;
    }

    public MenuPage switchingEnglishLanguage() {
        languageRussian.click();
        languageEnglish.click();
        return this;
    }

    public void resultClickCargoMenu() {
        cargoResult.shouldBe();
    }

    public void resultClickCompanyMenu() {
        companyResult.shouldBe();
    }

    public void resultClickCareerMenu() {
        careerResult.shouldBe();
    }

    public void resultClickContactsMenu() {
        contactsResult.shouldBe();
    }

    public void resultClickVersionForBlindMenu() {
        versionForTheBlindResult.shouldBe();
    }

    public void resultClickLoginMenu() {
        buttonAuthorization.shouldBe();
    }

    public void resultSwitchingRegistrationMenu() {
        buttonRegistration.shouldBe();
    }

    public void resultSwitchingEnglishVersionMenu() {
        englishElement.shouldBe();
    }
}
