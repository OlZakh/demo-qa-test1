package guru.qa;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x980";
    }

    @Test

    void fullFormTest() {
        open("https://demoqa.com/text-box");
        $("[id=userName]").setValue("Name");
        $("[id=userEmail]").setValue("fenfff@ya.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("penza");
        $("#submit").click();
        $("#output #name").shouldHave(text("Name"));
        $("#output #email" ).shouldHave(text("fenfff@ya.ru"));
        $("#output #currentAddress").shouldHave(text("Moscow"));
        $("#output #permanentAddress").shouldHave(text("penza"));

    }
}