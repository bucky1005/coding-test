import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(minusTwoNumbers(a,b));
    }

    private static int minusTwoNumbers(int a, int b) {
        return a - b;
    }
}
