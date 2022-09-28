package homework2;

public class Task3 {
    public static void main(String[] args) {
        int a = 637;
        int b = a / 16;
        int first = a % 16;
        int c = b / 16;
        int second = b % 16;
        int d = c / 16;
        int third = c % 16;
        String D = ""+third+second+first;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(D);


        double decimal = third*Math.pow(16 , 2) + second*Math.pow(16 , 1) + first*Math.pow(16 , 0);
        System.out.println(decimal);
    }
}
