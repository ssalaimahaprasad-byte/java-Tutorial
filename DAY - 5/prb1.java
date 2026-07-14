package day5;
import java.util.Scanner;
public class prb1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sr.nextInt();
        int large = 0;
        while (a != 0) {
            int pop = a % 10;
            if (large < pop) {
                large = pop;
            }
            a /= 10;
        }
        System.out.println("largest number:"+large);
    }
}
