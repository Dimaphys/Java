package homework5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данная программа выводит на экран результаты сложения, вычитания, умножения двух чисел. \nВведите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Сумма введённых чисел: " + sum(a, b));
        System.out.println("Разность введённых чисел:" + sub(a, b));
        System.out.println("Произведение введённых чисел:" + mult(a, b));
        System.out.println("Деление введённых чисел:" + div(a, b));
        scanner.close();
    }

    private static int sum(int c, int d) {
        return c + d;
    }

    private static int sub(int c, int d) {
        return c - d;
    }

    private static int mult(int c, int d) {
        return c * d;
    }

    private static double div(int c, int d) {
        return (double) c / d;
    }

}

