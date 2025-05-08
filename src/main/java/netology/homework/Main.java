package netology.homework;

import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {80000, 115000, 130000, 157000, 173000, 210000, 184000, 256000, 278000, 310000, 285000, 350000};

        System.out.println("1. Сумма продаж " + service.sumSales(sales) + " тыс. руб.");

        System.out.println("2. Среднее значение продаж в месяц " + service.averageSales(sales) + " тыс. руб.");

        System.out.println("3. Месяц максимальных продаж " + service.maxMonthSales(sales));

        System.out.println("4. Месяц минимальных продаж " + service.minMonthSales(sales));

        System.out.println("5. Количество месяцев, в которых продажи были ниже среднего " + service.salesBelowAverage(sales));

        System.out.println("6. Количество месяцев, в которых продажи были ниже среднего " + service.salesMoreAverage(sales));

    }
}