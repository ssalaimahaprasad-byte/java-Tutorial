package day6;
import java.util.Scanner;
public class ZigZag_number {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        for(int i=1;i<=5;i++) {
            int n=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n = n + 5 - j;
            }
            System.out.println();
        }
    }
}
