import java.util.HashMap;
import java.util.Scanner;

public class Product {

    public static void products(int humans) {
        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter();
        double productsSum = 0.00f;
        double productPrice = 0.00f;
        HashMap<String, Double> productsMap = new HashMap<String, Double>();

        while (true) {
            System.out.print("Введите название продукта ");
            String productName = scanner.next();

            System.out.print("Введите стоимоть продукта ");

            try {
                // вызывал конструктор parseDouble типа Double и перевожу строку в double
                // Сам я не додумался, а за меня додумался интернет
                productPrice = Double.parseDouble(scanner.next());
                if (productPrice > 0) {
                productsMap.put(productName, productPrice);
                System.out.println("Товар успешно добавлен\n");

                System.out.print("Желаете добавть ещё товар? \n");
                String wishQuestion = scanner.next();

                if (wishQuestion.equalsIgnoreCase("завершить") ||
                        wishQuestion.equalsIgnoreCase("нет")) {
                    System.out.println("Добавленные товары:\n");
                    for (String i : productsMap.keySet()) {
                        System.out.printf("Товар \"%s\" стоимостью \"%s\" %s\n", i,
                                productsMap.get(i).toString().replace(",", "."),
                                formatter.Formatter(productsMap.get(i)));
                    }
                    System.out.printf("Полная сумма всех товаров %.2f %s \n",
                            Calculator.sumPrice(productsMap),
                            formatter.Formatter(productsSum));
                    System.out.printf("Каждый посетитель должен заплатить %.2f \n",
                            Calculator.priceForPerson(productsMap, humans));
                    break;
                }
                } else {
                    System.out.println("Ёкарный бабай, шнурок, когда последний раз за " +
                            "твой кофе заправка платила?");
                }
            } catch (Exception e){
                System.out.println("Ёкарный бабай, мужики, как должно выглядеть число то?");
            }


        }
    }

}
