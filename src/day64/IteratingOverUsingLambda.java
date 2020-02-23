package day64;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverUsingLambda {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);


        groceryPriceMap.forEach((name, price) -> System.out.println("name  = " + name + " price = " + price));


    }
}
