package ru.netology.statistic;

public class StatsService {

    //-----------------Первый метод (Сумма всех продаж)----------------------//
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //-----------------Второй метод (Средняя сумма продаж)----------------------//
    public long calculateMidSum(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    // -----------------Третий метод(Номер месяца с максимальной суммой продаж)----------------------//
    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //---------------Четвертый метод(Номер месяца с минимальной суммой продаж)---------------------//
    public int monthMinSales(long[] sales) {
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

    // -----------------Пятый метод(Кол-во месяцев, в которых продажи были ниже среднего)------------//
    public int countMonthLessMid(long[] sales) {
        int lessMid = 0;
        //long midSum = calculateSum(sales) / sales.length;
        long midSum = calculateMidSum(sales);
        for (long sale : sales) {
            if (sale < midSum) {
                lessMid = lessMid + 1;
            }
        }
        return lessMid;
    }

    // -----------------Шестой метод (Кол-во месяцев, в которых продажи были выше среднего)------------//
    public int countMonthMoreMid(long[] sales) {
        int moreMid = 0;
        //long midSum = calculateSum(sales) / sales.length;
        long midSum = calculateMidSum(sales);
        for (long sale : sales) {
            if (sale > midSum) {
                moreMid = moreMid + 1;
            }
        }
        return moreMid;
    }
}


