package Test;

import WebHooks.WebHook;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Epic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static steps.CreateBug.*;
import static steps.Login.*;
import static steps.ProjectStatus.*;
import static steps.TaskBoard.*;

@Epic("Авторизация на Jira")
public class TestXpath extends WebHook {
    @DisplayName("Проверка количества")
    @Test
    public void quantity(){
        Selenide.open(Utils.Util.getConfig("url"));
        inputLog();
        inputPass();
        inputClick();
        projects();
        regular();
    }

    @DisplayName("Проверка статуса и версии")
    @Test
    public void statusAndVersion (){
        Selenide.open(Utils.Util.getConfig("url"));
        inputLog();
        inputPass();
        inputClick();
        seleniumSearch();
        collectionVersion();
        collectionStatus();
    }

    @DisplayName("Создание бага")
    @Test
    public void createBugAndStatus(){
        Selenide.open(Utils.Util.getConfig("url"));
        inputLog();
        inputPass();
        inputClick();
        clickCreate();
        completionTema();
        completionOpisanie();
        completionEnviroment();
        creatingTheDescribedBug();
        createDoneTest();
        businessProgress();
        checkBug();
    }
}
