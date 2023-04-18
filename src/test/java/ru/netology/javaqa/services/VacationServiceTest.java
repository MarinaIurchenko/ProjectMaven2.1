package ru.netology.javaqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VacationServiceTest {
    @Test
       void TestOne() {
        VacationService service = new VacationService();

        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;

        int actual = service.calculete(income,expense,threshold);
        int expected = 3;
        Assertions.assertEquals(expected,actual);

    }

    @Test
     void TestTwo() {
        VacationService service = new VacationService();

        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;

        int actual = service.calculete(income,expense,threshold);
        int expected = 2;
        Assertions.assertEquals(expected,actual);

    }
}
