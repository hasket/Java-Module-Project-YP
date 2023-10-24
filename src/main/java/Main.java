/*
Programm designed our devops
I'm so sorry

##
##  Calculator vashego nastorenia version 0.4
##
 */

import java.util.Scanner;

public class Main {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int humans = 0;

        while (humans <= 1) {
            System.out.print("\nВведите количество гостей ");
            try {
                humans = scanner.nextInt();
                if (humans <= 1) {
                    System.out.println(ANSI_YELLOW +
                            "Счёт не делится на такое количество человек." +
                            "\nВведите корректное число людей!(больше 1)" + ANSI_RESET);
                }
            } catch (Exception e) {
                System.err.println("Ёкарный бабай, шнурок, целое число больше одного введи");
                // Как понял из описаний в интернетах, из-за того, что первый раз мы вводим неправильный
                // символ и в сканнере он остаётся, мы не успеваем сменить символ и входим в эксепшн,
                // эксепшн ловит ошибку и снова убегает в catch, из-за этого цикл бесконечный,
                // а это мы задаём пустой символ и тогда значение в сканнере обнуляется.
                scanner.nextLine();
            }
        }
        Product.products(humans);

        System.out.println("Спасибо, что воспользовались нашей программой");
    }
}