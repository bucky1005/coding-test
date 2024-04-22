package section01.basic;

import java.util.Scanner;

public class Yoonyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(isThisYoonyear(year));
    }

    private static int isThisYoonyear(int year) {
        int condition1 = year % 4;
        System.out.println("condition1 = " + condition1);
        
        int condition2 = year % 100;
        System.out.println("condition2 = " + condition2);
        
        if(condition1 == 0 && condition2 != 0) {
            return 1;
        }
        return 0;
    }
}
