package page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MenuPage {

    private final SelenideElement
            menuButton = $(".sandwich-btn__icon"),
            licensesAndCertificatesButton = $("a[href='/licenses-and-certificates/']"),
            productionButton = $("a[href='/production/']"),
            pressCenterButton = $("a[href='/press-center/news/']"),
            useButton = $("a[href='/use/']"),

    titleLicensesPage = $("[data-content = 'Лицензии']"),
            titleCertificatesPage = $("[data-content = 'и сертификаты']"),
            titleProductionPage = $(byText("Производство защитных кейсов КОРСАР®")),
            titlePressCenterPage = $("[data-content = 'Пресс-центр Новости']");

    private final ElementsCollection
            titleUsePage = $$(".use-area-modal__menu-item");

    public MenuPage openPage() {
        open("");
        return this;
    }

    public MenuPage clickButtonMenu() {
        menuButton.click();
        return this;
    }

    public MenuPage clickButtonLicensesAndCertificates() {
        licensesAndCertificatesButton.click();
        return this;
    }

    public MenuPage clickButtonProduction() {
        productionButton.click();
        return this;
    }

    public MenuPage clickButtonPressCenter() {
        pressCenterButton.click();
        return this;
    }

    public MenuPage clickButtonUse() {
        useButton.click();
        return this;
    }

    public void resultClickLicensesAndCertificates() {
        titleLicensesPage.shouldBe(visible);
        titleCertificatesPage.shouldBe(visible);
    }

    public void resultClickProduction() {
        titleProductionPage.shouldBe(visible);
    }

    public void resultClickPressCenter() {
        titlePressCenterPage.shouldBe(visible);
    }

    public void resultClickUse() {
        titleUsePage.shouldBe(CollectionCondition.sizeGreaterThan(0));
    }
}
