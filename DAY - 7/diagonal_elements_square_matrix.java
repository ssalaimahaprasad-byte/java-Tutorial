package day7;
import java.util.Scanner;
public class diagonal_elements_square_matrix {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;

        for(int i=0;i<a.length;i++){
            sum+=a[i][i];
        }
        System.out.println("sum: "+sum);
    }
}
