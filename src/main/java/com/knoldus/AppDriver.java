package com.knoldus;

import java.util.Scanner;

public class AppDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter add = new CurrencyConverter();
        System.out.println("Enter the amount");
        double amount = scanner.nextDouble();
        System.out.println("Enter the currency from which you want to convert\n 1. Indian Rupee(INR) \n" +
                "2.Euro (EUR)\n" +
                "3.Japanese yen (JPY)\n" +
                "4.Pound sterling (GBP)\n" +
                "5.Australian dollar (AUD)\n" +
                "6.Canadian dollar (CAD)\n" +
                "7.US dollar (USD)\n");
        int from = scanner.nextInt();
        System.out.println("Enter the currency to which you want to convert\n 1. Indian Rupee(INR) \n" +
                "2.Euro (EUR)\n" +
                "3.Japanese yen (JPY)\n" +
                "4.Pound sterling (GBP)\n" +
                "5.Australian dollar (AUD)\n" +
                "6.Canadian dollar (CAD)\n" +
                "7.US dollar (USD)\n");
        int to = scanner.nextInt();
        System.out.println("===================================");
        add.convertCurrencyToAnother(from, to, amount);
        System.out.println("===================================");
    }
}
