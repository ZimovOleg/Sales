package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] salesOnMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void countSumOfSalesAllMonths() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.countSumOfSalesAllMonths(salesOnMonths);
        assertEquals(expected, actual);
    }

    @Test
    void countMedian() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.countMedian(salesOnMonths);
        assertEquals(expected, actual);
    }

    @Test
    void monthMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.monthMaxSales(salesOnMonths);
        assertEquals(expected, actual);
    }

    @Test
    void monthMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthMinSales(salesOnMonths);
        assertEquals(expected, actual);
    }

    @Test
    void monthsSalesBelowMedian() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsSalesBelowMedian(salesOnMonths);
        assertEquals(expected, actual);
    }

    @Test
    void monthsSalesOverMedian() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsSalesOverMedian(salesOnMonths);
        assertEquals(expected, actual);
    }
}