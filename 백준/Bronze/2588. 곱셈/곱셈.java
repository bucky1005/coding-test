import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int one = 0, ten = 0, hundred = 0;

        one = num2 % 10;
        ten = (num2 % 100) - one;
        hundred = num2 - ten - one;

        int result1 = num1 * one;
        int result2 = num1 * ten;
        int result3 = num1 * hundred;

        System.out.println(result1);
        System.out.println(result2 / 10);
        System.out.println(result3 / 100);
        System.out.println(result1 + result2 + result3);
		}
}