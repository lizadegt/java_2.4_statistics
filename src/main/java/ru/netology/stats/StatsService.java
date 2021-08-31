package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSumMonth(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = (int) sales[0];
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long monthsBelowAverageSale(long[] sales) {
        long sum = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= averageSumMonth(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

    public long monthsAboveAverageSale(long[] sales) {
        long sum = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= averageSumMonth(sales)) {
                month = month + 1;
            }
        }
        return month;
    }
}
