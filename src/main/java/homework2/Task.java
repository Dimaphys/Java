package homework2;

public class Task {
    public static void main(String[] args) {
    int a = 478;
    double b = a/100*Math.pow(16 , 2) + a%100/10*Math.pow(16 , 1) + a%10*Math.pow(16 , 0);
    System.out.println(b);
    }

}

