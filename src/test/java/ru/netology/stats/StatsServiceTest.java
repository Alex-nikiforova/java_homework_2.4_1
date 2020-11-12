package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSales() {
        StatsService service = new StatsService();
        float expected = 15;
        float actual = service.calculateAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthNumberMax() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.findMonthNumberMax(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthNumberMin() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.findMonthNumberMin(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calculateSalesBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calculateSalesAboveAverage(sales);

        assertEquals(expected, actual);
    }
}