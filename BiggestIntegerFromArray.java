package HackerRankPractice;

import java.util.Scanner;

public class BiggestIntegerFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println(BiggestInteger(sc, array));
    }

    public static int BiggestInteger(Scanner sc, int[] array) {
        int Big = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        for (int j = 1; j < array.length; j++) {
            if (array[j] > Big)
                Big = array[j];
        }
        return Big;

    }
}

