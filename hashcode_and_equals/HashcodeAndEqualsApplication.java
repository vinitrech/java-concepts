package hashcode_and_equals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HashcodeAndEqualsApplication {
    public static void main(String[] args) {
        Collection<User> users = new ArrayList<>();
        Collection<User> users2 = new HashSet<>();

        User user1 = new User("Vinicius", "12345678910");
        User user2 = new User("abc", "12345678910");

        addUser(users, user1);
        addUser(users, user1);
        addUser(users, user2);

        System.out.println("Imprimindo Lista:");
        users.forEach(System.out::println);

        addUser(users2, user1);
        addUser(users2, user2);

        System.out.println("Imprimindo Lista:");
        users2.forEach(System.out::println);
    }

    public static void addUser(Collection<User> list, User user) {
        if (!list.contains(user)) { // Após mudar o hashCode e o equals, não serão adicionados elementos com o mesmo CPF
            list.add(user);
        }
    }
}
