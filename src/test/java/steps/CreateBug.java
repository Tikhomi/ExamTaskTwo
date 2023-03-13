package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static pageElements.CreatePage.*;
import static pageElements.SelenidePage.status;

public class CreateBug {
    @Step("Нажатие на кнопку \"Создать\"")
    public static void clickCreate() {
        create.click();
    }
    @Step("Заполнение графы \"Тема\"")
    public static void completionTema(){
        topic.click();
        topic.setValue("CreateBug");
    }

    @Step("Заполнение графы \"Описание\"")
    public static void completionOpisanie(){
        switchTo().frame($("[id='mce_0_ifr']"));
        description.click();
        description.setValue("Kakoe-to opisanie");
        switchTo().defaultContent();
    }
    @Step("Заполнение графы \"Окружение\"")
    public static void completionEnviroment(){
        switchTo().frame($("[id='mce_6_ifr']"));
        environment.click();
        environment.setValue("Kakoe-to environment");
        switchTo().defaultContent();
    }

    @Step("Создание бага")
    public static void creatingTheDescribedBug(){
        createPJ.click();
    }

    @Step("Переход на раздел содержащий созданный баг")
    public static void createDoneTest(){
        message.click();
    }

    @Step("Перевод бага в статус \"Выполнено\"")
    public static void businessProgress(){
        business.click();
        complete.shouldBe(Condition.visible, Duration.ofSeconds(4)).click();
        sleep(2000);
    }
    @Step("Проверка статуса бага")
    public static void checkBug(){
        String statusBug = status.getText().toLowerCase();
        Assertions.assertEquals(statusBug,"готово");
    }
}
