import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumProducts = 0.0f;

        int humans = 0;
        while (humans <= 1) {
            System.out.print("Введите количество гостей ");
            humans = scanner.nextInt();
            if (humans > 1) {
                Product.products();
            } else {
                System.out.println("Счёт не делится на такое количество человек.\n" +
                        "Введите корректное число людей");
            }
        }
    }
}