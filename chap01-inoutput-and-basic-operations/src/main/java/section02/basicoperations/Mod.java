package section02.basicoperations;

import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0, input;

        for (int i = 0; i < 3; i++) {
            input = sc.nextInt();

            if(i == 0 && input >= 2)
                a = input;

            if(i == 1 && input <= 10000)
                b = input;

            if(i == 2 && input <= 10000)
                c = input;
        }

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
