import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean flag = false;

        System.out.println(validateQuadrant(x, y));
    }

    private static int validateQuadrant(double x, double y) {
//        1=(+,+) 2=(-,+) 3=(-,-) 4=(+,-)
        if (x > 0) {
            if(y>0){    // +,+
                return 1;
            } else {    // +,-
                return 4;
            }
        } else {
            if(y>0) {   // -,+
                return 2;
            } else {    // -,-
                return 3;
            }
        }
    }
}