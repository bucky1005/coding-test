package section02.basicoperations;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(plusTwoNumbers(a, b));
    }

    public static int plusTwoNumbers(int a, int b){
        return a + b;
    }
}
