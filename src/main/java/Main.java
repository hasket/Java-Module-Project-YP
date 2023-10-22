/*
Programm designed our devops
I'm so sorry

##
##  Calculator vashego nastorenia version 0.4
##
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int humans = 0;

        while (humans <= 1) {
            try {
                System.out.print("Введите количество гостей ");
                humans = scanner.nextInt();
                if (humans < 1) {
                    System.out.println("Счёт не делится на такое количество человек.\n" +
                            "Введите корректное число людей");
                }
            }
            catch (Exception e){
                System.out.println("Ёкарный бабай, шнурок, целое число больше одного введи");
            }
            }
        Product.products(humans);

        System.out.println("Спасибо, что воспользовались нашей программой");
    }
}