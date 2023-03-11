package Test;

import WebHooks.WebHook;
import io.qameta.allure.Epic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static pageElements.MainPage.*;
import static pageElements.SelenidePage.*;
import static steps.CreateBug.*;
import static steps.Login.*;
import static steps.ProjectStatus.*;
import static steps.TaskBoard.*;

@Epic("Авторизация на Jira")
public class TestXpath extends WebHook {
    @DisplayName("Проверка количества")
    @Test
    public void kolichestvo() {
        url(baseURL);
        inputLog(login);
        inputPass(password);
        inputClick();
        projects();
        regular();
    }

    @DisplayName("Проверка статуса и версии")
    @Test
    public void statusAndVersion (){//получение статуса и версии
        url(baseURL);
        inputLog(login);
        inputPass(password);
        inputClick();
        seleniumSearch(text);
        collectionVersion();
        sleep(1000);
        collectionStatus();
    }

    @DisplayName("Создание бага")
    @Test
    public void createBugAndStatus(){
        url(baseURL);
        inputLog(login);
        inputPass(password);
        inputClick();
        clickCreate();
        completionTema();
        completionOpisanie();
        completionEnviroment();
        creatingTheDescribedBug();
        createDoneTest();
        businessProgress();
    }
}
