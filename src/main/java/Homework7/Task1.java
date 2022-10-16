package Homework7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is there a weekend?) ");
        String isWeekend = scanner.next();
        boolean canWalk = false;

        if (isWeekend.equals("yes") ){
            System.out.println("It is raining outside?");
            String isRain = scanner.next();
            if (isRain.equals("no")){
                canWalk = true;
            }

        }
        if (canWalk == true){
            System.out.println("Go for a walk!");
        }
        else{
            System.out.println("We are going to stay home");
        }
        scanner.close();
    }

}
