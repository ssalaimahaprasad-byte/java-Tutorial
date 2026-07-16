package day7;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int id[] = new int[5];
        for (int i = 0; i < 5; i++) {
            int a = sr.nextInt();
            id[i] = a;
        }
        //for (int i = 0; i <= 5; i++) {
            System.out.println(id[3]);//(id[1]); it will print all values
    }
}
