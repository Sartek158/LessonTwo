package io.domaska.LessonTwo

import org.junit.Test
import org.openqa.selenium.By

import static com.codeborne.selenide.Selenide.*
import static com.codeborne.selenide.Condition.*

class LessonTwo {

    @Test

    void debagTst() {
        def searchRequest = "Dog"

        open("https://www.yandex.ru/")
        def searchInput = $(By.name("text"))
        searchInput.value = searchRequest
        searchInput.pressEnter()

        def found = $$(".main__content")
        assert found.size() > 0
        assert found.first().text.contains(searchRequest)

    }
}
