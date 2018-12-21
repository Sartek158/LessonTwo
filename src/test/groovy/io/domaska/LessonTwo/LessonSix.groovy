package io.domaska.LessonTwo

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import org.awaitility.Awaitility
import org.junit.Test
import org.openqa.selenium.By

import java.util.concurrent.TimeUnit


class LessonSix {

    @Test
    public void waitTest() {
        Selenide.open("https://www.google.ru")
        def searchField = Selenide.$(By.name("q"))
        searchField.should(Condition.visible)
        Awaitility.await().atMost(60, TimeUnit.SECONDS)
                .pollInterval(5, TimeUnit.SECONDS)
                .pollInSameThread()
                .ignoreExceptions()
                .until({
            def currentValue = searchField.getValue()
            println(currentValue)
            currentValue == "дрова"
        })


    }
}
