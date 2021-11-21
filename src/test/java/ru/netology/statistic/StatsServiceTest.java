package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    // =======================  Тест №1  ==============================//
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.calculateSum(yearSales);
        assertEquals(expected, actual);
    }

    // ======================  Тест №2  ================================//
    @Test
    void shouldCalculateMiddleSum() {
        StatsService service = new StatsService();
        long[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.calculateMidSum(yearSales);
        assertEquals(expected, actual);
    }

    // ======================  Тест №3  ================================//
    @Test
    void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        long[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        long actual = service.monthMaxSales(yearSales);
        assertEquals(expected, actual);
    }

    // ======================  Тест №4  ================================//
    @Test
    void shouldMonthMinSales() {
        StatsService service = new StatsService();
        long[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        long actual = service.monthMinSales(yearSales);
        assertEquals(expected, actual);
    }

    // ======================  Тест №5  ================================//
    @Test
    void shouldMonthLessMid() {
        StatsService service = new StatsService();
        long[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.countMonthLessMid(yearSales);
        assertEquals(expected, actual);
    }

    // ======================  Тест №6  ================================//
    @Test
    void shouldMonthMoreMid() {
        StatsService service = new StatsService();
        long[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.countMonthMoreMid(yearSales);
        assertEquals(expected, actual);
    }

}