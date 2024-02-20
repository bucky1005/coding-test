package section02.basicoperations;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(multiTwoNumbers(a,b));
    }

    private static int multiTwoNumbers(int a, int b) {
        return a * b;
    }
}
