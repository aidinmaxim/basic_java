package homeworks.homework_03;

import java.util.TreeSet;

public class HomeWork03 {

    public static void main(String[] args) {
        // Task #1
        int a1 = 0;
        int a2 = 1;
        int a3 = 2;
        int a4 = 3;
        int a5 = 4;
        int a6 = 5;
        int a7 = 6;
        int a8 = 7;
        int a9 = 8;
        int a10 = 9;

        int sum = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;

        int intAverage = sum / 10;
        System.out.println("среднее арифметическое в int: " + intAverage);

        double doubleAverage = (double) sum / 10;
        System.out.println("программа отбросила в дробной части: " + (doubleAverage - intAverage));
        System.out.println();

        // Task #2
        int priceA = 1000;
        int priceB = 500;
        double discount = 0.1;

        double totalPriceWithDiscount = (priceA + priceB) * (1 - discount);
        double savedMoney = (priceA + priceB) * discount;

        System.out.println("Стоимость суммы A+B со скидкой: " + totalPriceWithDiscount + " евро");
        System.out.println("Сумма скидки от этой покупки: " + savedMoney + " евро");
        System.out.println();

        // Task #3
        double tempMon = 26.5;
        double tempTue = 23.6;
        double tempWed = 28.4;
        double tempThu = 21.2;
        double tempFri = 24.9;
        double tempSat = 29.1;
        double tempSun = 20.3;

        double averageTemp = (tempMon + tempTue + tempWed + tempThu + tempFri + tempSat + tempSun) / 7;

        System.out.printf("Cредняя температура за неделю: %.1f", averageTemp);

        // Task #4
        TreeSet<Integer> set2 = new TreeSet<Integer>();
        TreeSet<Integer> set3 = new TreeSet<Integer>();

        for (int i=-100;i<100;i++) {
            set2.add(i % 2);
            set3.add(i % 3);
        }

        System.out.println("Варианты остатка от деления на 2: ");
        for (Integer number : set2) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Варианты остатка от деления на 3: ");
        for (Integer number : set3) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Task #5
        int x = 3;
        x += x++; // постинкрементация x не имеет тут никакого смысла, равносильно x += x;
        System.out.println(x); // 6

    }
}