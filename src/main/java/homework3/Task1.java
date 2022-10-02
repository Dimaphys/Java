package homework3;

import java.net.SocketOption;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please print radius");
        if (scanner.hasNextInt()){
            int S = scanner.nextInt();
            double SQ = S*S*3.14;
            System.out.println("The area of a circle with radius" + " " + SQ);
        }
        else{
            System.out.println("Its not a number");
        }
        scanner.close();
    }
}
