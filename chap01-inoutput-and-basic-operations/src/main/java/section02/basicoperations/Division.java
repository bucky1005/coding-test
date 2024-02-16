package section02.basicoperations;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(divideTwoNumbers(a, b));
    }

    private static double divideTwoNumbers(int a, int b) {
        double c = (double) a;
        double d = (double) b;
        return c / d;
    }
}
