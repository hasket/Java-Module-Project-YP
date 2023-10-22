import java.util.HashMap;
import java.util.Scanner;

public class Product {

    public static void products(int humans) {
        Scanner scanner = new Scanner(System.in);
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

                    System.out.print("Желаете добавить ещё товар? \n");
                    String wishQuestion = scanner.next();

                    if (wishQuestion.equalsIgnoreCase("завершить") ||
                            wishQuestion.equalsIgnoreCase("нет")) {
                        result(productsMap, humans);
                        break;
                    }
                } else {
                    System.out.println("Ёкарный бабай, шнурок, когда последний раз за " +
                            "твой кофе заправка платила?");
                }
            } catch (Exception e) {
                System.out.println("Ёкарный бабай, мужики, как должно выглядеть число то?");
            }


        }
    }

    private static void result(HashMap<String, Double> productsMap, int humans){
        Formatter formatter = new Formatter();
        double productsSum = Calculator.sumPrice(productsMap);

        System.out.println("Добавленные товары:\n");
        for (String i : productsMap.keySet()) {
            System.out.printf("Товар \"%s\" стоимостью \"%.2f\" %s\n", i,
                    productsMap.get(i),
                    formatter.Formatter(productsMap.get(i)));
        }
        System.out.printf("Полная сумма всех товаров %.2f %s \n",
                Calculator.sumPrice(productsMap),
                formatter.Formatter(productsSum));
        System.out.printf("Каждый посетитель должен заплатить %.2f %s \n",
                Calculator.priceForPerson(productsMap, humans),
                //Насколько правильно вызвать функцию, в которой вызывается функция?   <------
                formatter.Formatter(Calculator.priceForPerson(productsMap, humans)));
    }

}
