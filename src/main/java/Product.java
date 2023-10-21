import java.util.HashMap;
import java.util.Scanner;

public class Product {

    public static void products() {
        Scanner scanner = new Scanner(System.in);
        double productsSum = 0.00f;
        double productPrice = 0.00f;
        HashMap<String, Double> productsMap = new HashMap<String, Double>();

        while (true) {
            System.out.print("Введите название продукта ");
            String productName = scanner.next();

            System.out.print("Введите стоимоть продукта ");

            // вызывал конструктор parseDouble типа Double и перевожу строку в double
            // Сам я не додумался, а за меня додумался интернет
            try {
                productPrice = Double.parseDouble(scanner.next());
                productsSum = productsSum + productPrice;

                productsMap.put(productName, productPrice);
                System.out.println("Товар успешно добавлен");
                System.out.print("Желаете добавть ещё товар? ");
                String wishQuestion = scanner.next();

                if (wishQuestion.equalsIgnoreCase("завершить") ||
                        wishQuestion.equalsIgnoreCase("нет"))  break;
            } catch (Exception e){
                System.out.println("Вы ввели число неправильно формата, пожалуйста повторите ввод!");
            }


        }
    }

}
