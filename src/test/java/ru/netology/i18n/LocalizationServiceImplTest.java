package ru.netology.i18n;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import ru.netology.entity.Country;

public class LocalizationServiceImplTest {

    @BeforeAll
    public static void  startAll() {
        System.out.println("Начало теста");
    }
    @AfterAll
    public static void finishAll() {
        System.out.println("Окончание теста");
    }

    @DisplayName("Тест возвращаемого текста")
    @Test
    public void localeTest() {
        LocalizationService localizationService = Mockito.mock(LocalizationService.class);
        Mockito.when(localizationService.locale(Country.RUSSIA))
                .thenReturn("Добро пожаловать");
        Mockito.when(localizationService.locale(Country.USA))
                .thenReturn("Welcome");

        Assertions.assertEquals("Добро пожаловать", localizationService.locale(Country.RUSSIA));
        Assertions.assertEquals("Welcome", localizationService.locale(Country.USA));
    }

}

