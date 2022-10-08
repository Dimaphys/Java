package homework5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово состоящее из чётного количества букв");
        String str = scanner.next();
//
        int l = str.length();
        if (l%2 == 0) {
            System.out.println("Количество букв: " + l);
            System.out.println("Первая половина слова: " + str.substring(0, l/2));
            System.out.println("Вторая половина слова: " + str.substring(l/2));
            System.out.println("Слово состоящее изпервой половины слова и второй половины: " + str.substring(0, l/2) + str.substring(l/2));

        }
        else{
            System.out.println("Число состоит из нечетного количества букв");
        }
        scanner.close();
    }
}

