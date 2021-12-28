package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @Test

    void fullFormTest() {
        open("https://demoqa.com/text-box");
        $("[id=userName]").setValue("Name");
        $("[id=userEmail]").setValue("fenfff@ya.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("penza");

    }
}
