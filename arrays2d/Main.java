package arrays2d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[][] board = new char[3][3];
        char[][] board2 = new char[][]{
                new char[]{'-', '-', '-'},
                new char[]{'-', '-', '-'},
                new char[]{'-', '-', '-'}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '*';
            }
        }

        System.out.println(Arrays.deepToString(board));

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
    }
}
