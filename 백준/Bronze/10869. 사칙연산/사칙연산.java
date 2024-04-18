import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, a, b = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        do {
            num = sc.nextInt();

            if(num <= 10000){
                b = num;
                flag = false;
            }
        } while(flag);

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
		}
}