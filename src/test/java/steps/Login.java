package steps;

import io.qameta.allure.Step;

import static pageElements.MainPage.*;

public class Login {

    @Step("Ввод логина")
    public static void inputLog (){
        inputLogin.setValue(Utils.Util.getConfig("login"));
    }

    @Step("Ввод пароля")
    public static void inputPass (){
        inputPassword.setValue(Utils.Util.getConfig("password"));
    }

    @Step("Нажатие на кнопку \"Войти\"")
    public static void inputClick (){
        entry.click();
    }
}
