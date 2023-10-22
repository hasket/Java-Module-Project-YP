import java.util.HashMap;

public class Calculator {

    public static double sumPrice(HashMap <String, Double> productsMap){
        double sumPriceResult = 0.00f;
        for (Object i: productsMap.keySet()) {
            sumPriceResult = sumPriceResult + productsMap.get(i);
        }
        return sumPriceResult;
    }

    public static double priceForPerson(HashMap <String, Double> productsMap,int humans){
        double pricePerson = sumPrice(productsMap) / humans;
        return pricePerson;
    }

}