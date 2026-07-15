package day6;
import java.util.Scanner;
public class multiplication_triangle {
    public static void main(String[] args) {
            Scanner sr = new Scanner(System.in);
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <=5; j++) {
                    System.out.printf("%4d",i*j);// we use printf
                }
                System.out.println();
            }
    }
}


