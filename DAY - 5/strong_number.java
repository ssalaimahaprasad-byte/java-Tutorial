package day5;
import java.util.Scanner;// 3 digit num ahh eaduthon na last digit ahh factoriall pani add panuna same ahh irrukanum
public class strong_number {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);// 145 is a strong number
        int a = sr.nextInt();
        int o = a;
        int sum = 0;
        while (a != 0) {
            int p = a % 10;
            int fact = 1;
            for (int i = 1; i <= p; i++) {
                fact *= i;
            }
            sum += fact;
            a /= 10;
        }
        if (sum == o) {

            System.out.println("yes it is strong number");
        } else {
            System.out.println("no it is strong number");
        }
    }
}
