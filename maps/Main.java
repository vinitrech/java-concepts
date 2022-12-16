package maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();

        people.put(1, "Vinicius");
        people.put(2, "Vinicius 2");
        people.put(3, "Vinicius 3");
        people.put(1, "Vinicius 1"); // overrides key 1

        System.out.println(people);
        System.out.println(people.size());
        System.out.println(people.get(1));
        System.out.println(people.keySet());
        System.out.println(people.entrySet());
    }
}
