package pageElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreatePage {
    //public static String textTema = "CreateBug";
    public static SelenideElement create = $x("//a[@id ='create_link']");
    public static SelenideElement topic = $x("//input[@id='summary']");
    public static SelenideElement description = $x("//body[@id='tinymce' and @data-id='mce_0']/child::p");
    public static SelenideElement environment = $x("//body[@id='tinymce' and @data-id='mce_6']/child::p");
    public static SelenideElement createPJ = $x("//input[@id='create-issue-submit']");
    public static SelenideElement business = $x("//span[contains(text(), 'Бизнес-процесс')and @class='dropdown-text']/..");
    public static SelenideElement complete = $x("//span[contains(text(), 'Выполнено')and @class='trigger-label']/..");
    public static SelenideElement inputText = $x("//input[@id='quickSearchInput']");
}

