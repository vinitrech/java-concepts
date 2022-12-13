package POJO;

/*
 * POJO: Plain Old Java Object
 *
 * Rules:
 * 1 - Can't extend any class
 * 2 - Can't implement any interface
 * 3 - No outside annotations
 *
 * Basically, it's a simples class that can be used on its own
 * */

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("zebra");
    }
}
