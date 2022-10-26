package GitHubTest2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AnotherTrain {
    @Test
    @DisplayName("Тест открытия раздела Enterprise на GitHub")
    void hoverTrain() {
        open("https://github.com");
        $$(".HeaderMenu-item button").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $("title").shouldHave(attribute("text", "Enterprise · A smarter way to work together · GitHub"));
    }
    @Test
    @DisplayName("Тест drag&drop")
    void dragAnddrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a header").shouldHave(text("B"));
    }
}
