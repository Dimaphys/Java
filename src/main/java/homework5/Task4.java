package homework5;

public class Task4 {
    public static void main(String[] args) {
    int a = 24;
    int b = 28;
    double small = S(a/2);
    double big = S(b/2);
    System.out.println("Количество каллорий:" + ((big - small) * 40));
    }
    private static double S(int radius){
        return radius * radius * Math.PI;
    }
}
