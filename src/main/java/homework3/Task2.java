package homework3;
import java.net.SocketOption;
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("Hello" + " " + name);

        scanner.close();
    }
}



