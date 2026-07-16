package day7;
import java.util.Scanner;
public class odd_even_sum {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int []id={2,3,5,-3,14};
        int evensum=0;
        int oddsum=0;
        for(int num:id) {
            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
