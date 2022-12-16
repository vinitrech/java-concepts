package linked_lists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(); // The nodes have references to the next and previous node

        linkedList.add("First");
        linkedList.add(1, "New added element to index 1");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");

        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
    }
}
