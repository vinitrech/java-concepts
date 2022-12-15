package sets_and_hashsets;

import java.util.HashSet;

public class SetsAndHashsets {
    public static void main(String[] args) {
        //Set<String> names = new Set<>(); <= Set is an interface, not a class
        HashSet<String> names = new HashSet<>();

        names.add("Name 1");
        names.add("Name 2");
        names.add("Name 3");
        names.add("Name 4");
        names.add("Name 4"); // duplicate elements are not inserted

        names.remove("Name 2"); // cannot remove by index

        // A List maintains the order of elements, but hashsets have no particular order
        System.out.println(names);

        for(String name: names){
            System.out.println(name);
        }

        System.out.println();

        names.forEach(System.out::println);
    }
}
