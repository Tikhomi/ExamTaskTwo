package pageElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public static SelenideElement inputLogin = $x("//input[@name='os_username']");
    public static SelenideElement inputPassword = $x("//input[@name='os_password']");
    public static SelenideElement entry = $x("//input[@id='login']");
}

