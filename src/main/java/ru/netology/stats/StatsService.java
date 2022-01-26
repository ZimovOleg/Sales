package ru.netology.stats;

public class StatsService {

    public int totalSalesForAllMonths(int[] salesOnMonths) {
        int sum = 0;
        for (int sale : salesOnMonths) {
            sum += sale;
        }
        return sum;
    }

    public int averageProfitMonths(int[] salesOnMonths) {
        int average = totalSalesForAllMonths(salesOnMonths) / salesOnMonths.length;
        return average;
    }

    public int monthMaxSales(int[] salesOnMonths) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : salesOnMonths) {
            if (sale >= salesOnMonths[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int monthMinSales(int[] salesOnMonths) {
        int minMonth = 0;
        int month = 0;
        for (int sale : salesOnMonths) {
            if (sale <= salesOnMonths[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsSaleslowAverage(int[] salesOnMonths) {
        int monthsSales = averageProfitMonths(salesOnMonths);
        int monthsBelowAverage = 0;
        for (int sale : salesOnMonths) {
            if (sale < monthsSales) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int monthsSalesMaxAverage(int[] salesOnMonths) {
        int monthsSales = averageProfitMonths(salesOnMonths);
        int monthsMaxMedian = 0;
        for (int sale : salesOnMonths) {
            if (sale > monthsSales) {
                monthsMaxMedian++;
            }
        }
        return monthsMaxMedian;
    }
}