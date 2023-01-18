package ru.netology.stats;

public class StatsService {

    public int getSalesAmount(int[] sales) {
        int salesAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            salesAmount = salesAmount + sales[i];
        }
        return salesAmount;
    }

    public int getAverageSalesAmount(int[] sales) {
        int salesAmount = getSalesAmount(sales);
        return salesAmount / 12;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int getLessThanAverage(int[] sales) {
        int salesAmount = getSalesAmount(sales);
        int lessThanAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAmount / 12) {
                lessThanAverage ++;
            }
        }
        return lessThanAverage;
    }

    public int getMoreThanAverage(int[] sales) {
        int salesAmount = getSalesAmount(sales);
        int moreThanAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAmount / 12) {
                moreThanAverage ++;
            }
        }
        return moreThanAverage;
    }
}

