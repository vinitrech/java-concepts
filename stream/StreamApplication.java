package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Vinicius", 11));
        people.add(new Person("Vinicius2", 12));
        people.add(new Person("Vinicius3", 13));
        people.add(new Person("Vinicius4", 14));
        people.add(new Person("Vinicius5", 15));

        List<Person> thirteenPlus = people.stream().filter(person -> person.getAge() > 12).sorted(Comparator.comparing(Person::getName)).toList();

        // Streams are abstractions that focuses on the overall picture instead of each individual part
        // It is great for readability and conciseness since it uses a functional approach
        // Mainly used with collections
        // The stream() method creates a stream from the collection, meaning: stream is a
        // sequence of elements from a collection that provides support for many kinds of
        // aggregation functions, such as filter, map and collect.

        thirteenPlus.stream().filter(person -> person.getName().length() > 5).toList().forEach((person -> {
            System.out.println(person.getName() + " - " + person.getAge());
        }));

        List<Person> thirteenBelow = people.stream().filter(person -> person.getAge() < 14).toList();
        thirteenBelow.forEach(System.out::println); // Gets the toString method from the collection definition (Person)
    }


}
