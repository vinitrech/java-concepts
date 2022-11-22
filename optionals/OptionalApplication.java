package optionals;

import java.util.Objects;
import java.util.Optional;

public class OptionalApplication {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> string = Optional.of("Hello");

        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        System.out.println(string.isPresent());
        System.out.println(string.isEmpty());

        String orElse = string.map(String::toUpperCase).orElseGet(() -> {
            //extra logic
            return "world";
        });
        System.out.println(orElse);

        string.ifPresent(System.out::println);
    }
}
