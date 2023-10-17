import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // 1. se til att kunna läsa in fil
        // 2. testa att lägga till något med en add()
        // 3. Testa saveFIle() metoden och kontrollera att det sparas

        // map funktioner som tillhör Map Interface
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        System.out.println("Keys: " + numbers.keySet());
        System.out.println("Values: " + numbers.values());
        System.out.println("Entries: " + numbers.entrySet());

       // int value = numbers.remove("Two");
        //System.out.println("Removed value: " + value);
       // System.out.println("Entries: " + numbers.entrySet());

        numbers.replace("One", 11);
        System.out.println("Entries: " + numbers.entrySet());
        numbers.replace("One", 11, 12);
        System.out.println("Entries: " + numbers.entrySet());






    }
}
