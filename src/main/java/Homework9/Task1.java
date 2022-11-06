package Homework9;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] rand = new int[15];
        Random random = new Random(123);
        int count = 0;
        for (int i = 0; i < rand.length; i++) {
            rand[i] = random.nextInt(9);
            if (rand[i] % 2 == 0)
            {
                count++;
            }
        }
        System.out.println(Arrays.toString(rand));
        System.out.println(count);
    }
}
