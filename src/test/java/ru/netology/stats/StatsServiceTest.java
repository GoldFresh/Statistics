package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcSalesAmount() {

        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 180;
        int actual = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSalesAmount() {

        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 15;
        int actual = service.getAverageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {

        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 7;
        int actual = service.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {

        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 8;
        int actual = service.getMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulCalcLessThanAverage() {

        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.getLessThanAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulCalcMoreThanAverage() {

        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.getMoreThanAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
