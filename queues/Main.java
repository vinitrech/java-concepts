package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>(); // Queue is an interface, like List

        supermarket.add(new Person("Vinicius", 24));
        supermarket.offer(new Person("Vinicius", 24)); // Offer should be used when there is a capacity constraint on the queue
        supermarket.add(new Person("Vinicius 2", 25));
        supermarket.add(new Person("Vinicius 3", 26));
        supermarket.add(new Person("Vinicius 4", 27));

        System.out.println(supermarket.peek());
        supermarket.poll();
        System.out.println(supermarket.peek());
    }

    static record Person(String name, Integer age) {
    }
}
