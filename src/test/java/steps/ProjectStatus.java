package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

import static pageElements.CreatePage.*;
import static pageElements.SelenidePage.status;
import static pageElements.SelenidePage.versions;

public class ProjectStatus {
    public static void seleniumSearch(String input){
        inputText.click();
        inputText.setValue(input);
        inputText.sendKeys(Keys.ENTER);
    }
    @Step("Парсинг версии и ее проверка")
    public static void collectionVersion(){
        String vers = versions.getText();
        Assertions.assertEquals(vers,"Version 2.0");
    }
    @Step("Парсинг статуса и его проверка")
    public static void collectionStatus(){
        String inProgress = status.getText().toLowerCase();
        Assertions.assertEquals(inProgress,"сделать");
    }

}
