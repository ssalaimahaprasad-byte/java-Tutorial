package day7;
import java.util.Scanner;
public class max_min {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int []arr = {9,4,5,6,2,10};
        int max=arr[0];
        int min=arr[0];
        for(int i:arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
            System.out.println(max);
            System.out.println(min);
    }
}
