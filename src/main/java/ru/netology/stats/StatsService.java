package ru.netology.stats;

public class StatsService {

    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public float calculateAverageSales(int[] sales) {
        int sum = calculateSumSales(sales);
        float averageSum = sum / 12;
        return averageSum;
    }


    public int findMonthNumberMax(int[] sales) {
        int maxSale = sales[0];
        int monthNumberMax = 0;
        int currentMonthNumber = 1;
        for (int sale : sales) {
            if (sale >= maxSale) {
                maxSale = sale;
                monthNumberMax = currentMonthNumber;
            }
            currentMonthNumber++;
        }
        return monthNumberMax;
    }


    public int findMonthNumberMin(int[] sales) {
        int minSale = sales[0];
        int monthNumberMin = 0;
        int currentMontNumber = 1;
        for (int sale : sales) {
            if (sale <= minSale) {
                minSale = sale;
                monthNumberMin = currentMontNumber;
            }
            currentMontNumber++;
        }
        return monthNumberMin;
    }

    public int calculateSalesBelowAverage(int[] sales) {
        int numberOfMonths = 0;
        float average = calculateAverageSales(sales);
        for (int sale : sales) {
            if (sale < average)
                numberOfMonths++;
        }
        return numberOfMonths;
    }

    public int calculateSalesAboveAverage(int[] sales) {
        int numberOfMonths = 0;
        float average = calculateAverageSales(sales);
        for (int sale : sales)
            if (sale > average) {
                numberOfMonths++;
            }
        return numberOfMonths;
    }
}
