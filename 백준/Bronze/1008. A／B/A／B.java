import java.util.Scanner;

public class Main {
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