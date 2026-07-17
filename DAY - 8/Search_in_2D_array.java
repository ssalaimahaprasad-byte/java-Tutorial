package day8;
import java.util.Scanner;
public class Search_in_2D_array {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[][] name1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 4;

        if (ls(name1, target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
    public static boolean ls(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == n) {
                    return true;
                }
            }
        }

        return false;
    }
}