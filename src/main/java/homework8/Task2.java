package homework8;

public class Task2 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 163; i+=4) {
                    counter++;
                    System.out.println(i);
        }
            System.out.println("количество итераций: " + ++counter);
    }
}
