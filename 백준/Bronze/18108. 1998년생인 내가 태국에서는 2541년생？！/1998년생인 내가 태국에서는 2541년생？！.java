import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gap = 2541-1998;
        int year = 0;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        do{
            int taiwanYear = sc.nextInt();

            if(taiwanYear >= 1000 && taiwanYear <= 3000){
                year = taiwanYear - gap;
                flag = false;
            }
        }while (flag);

        System.out.println(year);
    }
}