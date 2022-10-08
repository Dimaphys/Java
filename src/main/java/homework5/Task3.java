package homework5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данная программа выводит на экран эквивалент введённого числа в евро в долларах США\nВведите количество евро");
        int a = scanner.nextInt();
        System.out.println("Количество долларов: " + dol(a));

        scanner.close();
    }
    private static double dol(int b){
        return (double) b * 0.97;
    }
}
