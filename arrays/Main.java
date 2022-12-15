package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        for (Integer i : numbers) {
            System.out.println(i);
        }

        String[] colors = new String[5];
        colors[0] = "blue";
        colors[1] = "yellow";
        colors[2] = "red";
        colors[3] = "black";
        colors[4] = "grey";

        System.out.println(Arrays.toString(colors));
    }
}
