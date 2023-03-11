package steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static pageElements.MainPage.*;

public class Login {
    @Step("Открытие ссылки")
    public static void url(String url){
        Selenide.open(url);
    }

    @Step("Ввод логина")
    public static void inputLog (String log){
        inputLogin.setValue(log);
    }
    @Step("Ввод пароля")
    public static void inputPass (String pass){
        inputPassword.setValue(pass);
    }

    @Step("Нажатие на кнопку \"Войти\"")
    public static void inputClick (){
        entry.click();
    }
}
