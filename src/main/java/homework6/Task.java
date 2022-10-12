package homework6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("суммарное количество секунд до конца дня, суммарное количество минут до конца дня и суммарное количество часов до конца рабочего дня \nВведите какой сейчас час");
        int hrs = scanner.nextInt();
        if (hrs <= 17 && hrs >= 8){
            System.out.println("Введите сколько сейчас минут");
            int min = scanner.nextInt();
            if (min <= 60 && min >= 0){
               int hoursleft = hours(hrs, min);
               int minleft = minutes(min, hoursleft);
               int secleft = sec(minleft);
               System.out.println("Количество оставшихся рабочих часов: " + hoursleft);
               System.out.println("Количество оставшихся рабочих минут: " + minleft);
               System.out.println("Количество оставшихся рабочих секунд: " + secleft);
           }
        }

    }

    private static int hours(int hrs, int min){
        int a = min > 0 ? 16:17;
        return a-hrs;
    }
    private static int minutes(int a, int b){
        return (60-a)+b*60;
    }
    private static int sec(int a){
        return a * 60;
    }



}
