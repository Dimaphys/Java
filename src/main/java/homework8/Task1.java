package homework8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose tea: 1 - espresso, 2 - americano, 3 - cappuccino, 4 - tea");
        int drink = scanner.nextInt();
        switch (drink){
            case 1 -> {
                makeEspresso();
                System.out.println("Espresso is ready");
            }
            case 2 -> {
                makeEspresso();
                addWater();
                System.out.println("Americano is ready");
            }
            case 3 ->{
                makeEspresso();
                addMilk();
                System.out.println("Cappuccino is ready");
            }
            case 4 -> {
                addWater();
                addTeaPackage(scanner);
                System.out.println("Tea is ready");
            }
        }
scanner.close();

    }
        private static void makeEspresso(){
            System.out.println("Make Espresso");
        }
        private static void addWater(){
            System.out.println("Add some Water");
        }
        private static void addMilk(){
            System.out.println("Add some Milk");
     }
        private static void addTeaPackage(Scanner scanner){
            System.out.println("Choose tea: 1 - black tea, 2 - green tea, 3 - matcha tea");
            int b = scanner.nextInt();

            System.out.println("");
        }

}
