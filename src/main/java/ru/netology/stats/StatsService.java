package ru.netology.stats;

public class StatsService {

    public int countSumOfSalesAllMonths(int[]salesOnMonths){
        int sum = 0;
        for (int sale : salesOnMonths) {
            sum += sale;
        }
        return sum;
    }

    public int countMedian(int[]salesOnMonths){
        int median = countSumOfSalesAllMonths(salesOnMonths) / salesOnMonths.length;
        return median;
}

    public int monthMaxSales(int[]salesOnMonths){
        int currentMax = salesOnMonths[0];
        int numberOfMonthMaxSales = 0;
        for (int i = 0; i < salesOnMonths.length; i++) {
            if (salesOnMonths [i] >= currentMax) {
                currentMax = salesOnMonths[i];
                numberOfMonthMaxSales = i + 1;
            }
        }
        return numberOfMonthMaxSales;
    }

    public int monthMinSales(int[]salesOnMonths){
        int currentMin = salesOnMonths[0];
        int numberOfMonthMinSales = 0;
        for (int i = 0; i < salesOnMonths.length; i++) {
            if (salesOnMonths [i] <= currentMin) {
                currentMin = salesOnMonths[i];
                numberOfMonthMinSales = i + 1;
            }
        }
        return numberOfMonthMinSales;
    }

    public int monthsSalesBelowMedian(int[]salesOnMonths){
        int medianSales = countMedian(salesOnMonths);
        int monthsBelowMedian = 0;
        for (int sale : salesOnMonths) {
            if (sale < medianSales) {
                monthsBelowMedian++;
            }
        }
        return monthsBelowMedian;
    }

    public int monthsSalesOverMedian(int[]salesOnMonths){
        int medianSales = countMedian(salesOnMonths);
        int monthsOverMedian = 0;
        for (int sale : salesOnMonths) {
            if (sale > medianSales) {
                monthsOverMedian++;
            }
        }
        return monthsOverMedian;
    }
}