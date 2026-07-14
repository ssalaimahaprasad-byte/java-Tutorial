package day5;
import java.util.Scanner;
public class isamstrongnumber {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        int org = num;
        int sum = 0;
        while (num != 0) {
            int pop = num % 10;
            sum += pop * pop * pop;
            num = num / 10;
        }
        if (sum == org) {
            System.out.println("amstrong number");
        } else {
            System.out.println("not an amstrong number");
        }
    }
}