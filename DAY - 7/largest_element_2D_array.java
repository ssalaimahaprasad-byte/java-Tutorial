package day7;
import java.util.Scanner;
public class largest_element_2D_array {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a[][] = {{10, 2, 40}, {3, 60, 5}, {70, 8, 9}};
        int s = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] > s) {
                    s = a[i][j];
                }
            }
            System.out.println("Largest number:" + s);
        }
    }
}
