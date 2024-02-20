package section03.application;

import java.util.Locale;
import java.util.Scanner;

public class PrintQuestionMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = "";
        boolean flag = true;

        do {
            String inputId = sc.nextLine();
            if(inputId.length() <= 50){
                id = inputId.toLowerCase(Locale.ROOT);
                flag = false;
            }
        } while (flag);

        System.out.println(id + "??!");
    }
}
