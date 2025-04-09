package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findOne() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findSimilar() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {2,2};
        long expected = 2;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxLast() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10,10,10,15};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10,10,15,10,10};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}