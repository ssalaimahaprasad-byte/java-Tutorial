package day6;
import java.util.Scanner;
public class hallow_square {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = 5;//nxn
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++) {
                if (i==1||j==1||i==n||j==n) {
                    System.out.print("*  ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
