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

        thirteenPlus.stream().forEach(person -> {
            System.out.println(person.getName() + " - " + person.getAge());
        });
    }


}