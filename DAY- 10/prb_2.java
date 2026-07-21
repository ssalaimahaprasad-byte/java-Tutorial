package day16;
import java.util.Scanner;
public class prb_2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        char ch = sr.next().charAt(0);
        if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
                ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}