package homework7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature of the first flask?");
        int Temperature1 = scanner.nextInt();
        System.out.println("What is the temperature of the second flask?");
        int Temperature2 = scanner.nextInt();
        boolean work = false;
        if (Temperature1 > 100 && Temperature2 < 100){
            work = true;

        }
         System.out.println(work);

 }
}
