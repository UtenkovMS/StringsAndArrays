package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void shouldCalculateSumSales() {

        StatsService service = new StatsService();
        long[] sales = {80000, 115000, 130000, 157000, 173000, 210000, 184000, 256000, 278000, 310000, 285000, 350000};

        long expectedSumSales = 2528000;
        long actual = service.sumSales(sales); // вызываем метод sumSales из класса StatsService.Java для выполнения функции
        Assertions.assertEquals(expectedSumSales, actual); // производим сравнение ожидаемого значения с фактическим

    }

    @Test
    void shouldCalculateAverageSales() {

        StatsService service = new StatsService();
        long[] sales = {80000, 115000, 130000, 157000, 173000, 210000, 184000, 256000, 278000, 310000, 285000, 350000};

        double expectedAverageSales = 210666;
        double actual = service.averageSales(sales); // вызываем метод averageSales из класса StatsService.Java для выполнения функции
        Assertions.assertEquals(expectedAverageSales, actual); // производим сравнение ожидаемого значения с фактическим

    }

    @Test
    void shouldCalculateMaxMonthSales() {

        StatsService service = new StatsService();
        long[] sales = {80000, 115000, 130000, 157000, 173000, 210000, 184000, 256000, 278000, 310000, 285000, 350000};

        int expectedMaxMonth = 12;
        int actual = (int) service.maxMonthSales(sales); // вызываем метод maxMonthSales из класса StatsService.Java для выполнения функции
        Assertions.assertEquals(expectedMaxMonth, actual); // производим сравнение ожидаемого значения с фактическим

    }

    @Test
    void shouldCalculateMinMonthSales() {

        StatsService service = new StatsService();
        long[] sales = {80000, 115000, 130000, 157000, 173000, 210000, 184000, 256000, 278000, 310000, 285000, 350000};

        int expectedMinMonth = 1;
        int actual = (int) service.minMonthSales(sales); // вызываем метод minMonthSales из класса StatsService.Java для выполнения функции
        Assertions.assertEquals(expectedMinMonth, actual); // производим сравнение ожидаемого значения с фактическим

    }

    @Test
    void shouldCalculateSalesBelowAverage() {

        StatsService service = new StatsService();
        long[] sales = {80000, 115000, 130000, 157000, 173000, 210000, 184000, 256000, 278000, 310000, 285000, 350000};

        int expectedSalesBelowAverage = 7;
        int actual = (int) service.salesBelowAverage(sales); // вызываем метод salesBelowAverage из класса StatsService.Java для выполнения функции
        Assertions.assertEquals(expectedSalesBelowAverage, actual); // производим сравнение ожидаемого значения с фактическим

    }

    @Test
    void shouldCalculateSalesMoreAverage() {

        StatsService service = new StatsService();
        long[] sales = {80000, 115000, 130000, 157000, 173000, 210000, 184000, 256000, 278000, 310000, 285000, 350000};

        int expectedSalesMoreAverage = 5;
        int actual = (int) service.salesMoreAverage(sales); // вызываем метод salesBelowAverage из класса StatsService.Java для выполнения функции
        Assertions.assertEquals(expectedSalesMoreAverage, actual); // производим сравнение ожидаемого значения с фактическим

    }
}
