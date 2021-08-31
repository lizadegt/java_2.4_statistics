package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;

        long actual = service.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void averageSumMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;

        long actual = service.averageSumMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;

        long actual = service.monthsBelowAverageSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void onthsAboveAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;

        long actual = service.monthsAboveAverageSale(sales);

        assertEquals(expected, actual);
    }
}

