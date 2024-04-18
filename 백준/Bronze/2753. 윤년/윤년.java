import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputYear = sc.nextInt();

        System.out.println(validateYoonyear(inputYear));
    }

    private static int validateYoonyear(int year) {
        if(year % 4 == 0){
            if(year % 100 != 0){
                return 1;
            } else if (year % 400 == 0) {
                return 1;
            }
        }
        return 0;
    }
}