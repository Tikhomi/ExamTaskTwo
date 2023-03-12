package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static pageElements.BoardPage.*;

public class TaskBoard {
    @Step("Переход в раздел \"Задачи\" и сбор кол-ва задач")
    public static void projects (){
        upPanel.click();
        searchTask.click();
    }

    @Step("Нажатие на раздел \"Все задачи\" и сбор кол-ва задач")
    public static void tasksBoard(){
        panelTask.click();
    }

    @Step("Проверка соотвествия кол-ва задач")
    public static void regular(){
        String howMany = quantity.getText();
        Pattern pattern = Pattern.compile("\\d+$");
        Matcher matcher = pattern.matcher(howMany);
        matcher.find();
        tasksBoard();
        String HWTask = allTasks.getText();
        Pattern patterns = Pattern.compile("\\d+$");
        Matcher matchers = patterns.matcher(HWTask);
        matchers.find();
        String a1 = matchers.group();
        String a2 = matcher.group();
        Assertions.assertEquals(a1,a2);
    }
}
