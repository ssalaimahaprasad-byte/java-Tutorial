package day6;
import java.util.Scanner;
public class solid_square {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n=5;//n*n
        for(int i=0;i<n;i++){// outer loop(row)
            for(int j=n;j>i;j--){// outer loop(colum)
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
