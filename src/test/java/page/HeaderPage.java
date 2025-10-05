package page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class HeaderPage {

    public static String nameProduct = "Ударопрочный";

    private final SelenideElement
            catalogButton = $(".header__links [href='/catalog/']"),
            leaveRequestButton = $(".header__links [data-target='#callbackForma']"),
            searchButton = $(byText("Поиск")),
            searchInput = $(".search__input"),

    catalogResult = $("[data-content='Каталог защитных кейсов и контейнеров']"),
            leaveRequestResult = $(".callback-forma");

    private final ElementsCollection
            productsSearchResult = $$(withTagAndText("span", nameProduct));


    public HeaderPage openPage() {
        open("");
        return this;
    }

    public HeaderPage clickCatalogHeader() {
        catalogButton.click();
        return this;
    }

    public HeaderPage clickLeaveRequestHeader() {
        leaveRequestButton.click();
        return this;
    }

    public HeaderPage clickStringSearchHeader() {
        searchButton.click();
        return this;
    }

    public HeaderPage searchProductHeader() {
        searchInput.click();
        searchInput.sendKeys(nameProduct);
        searchInput.pressEnter();
        return this;
    }

    public void resultClickCatalogHeader() {
        catalogResult.shouldBe();
    }

    public void resultClickRequestResultHeader() {
        leaveRequestResult.shouldBe(visible);
    }

    public void resultSearchProduct() {
        productsSearchResult.shouldBe(CollectionCondition.empty);
    }
}
