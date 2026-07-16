package day7;
import java.util.Scanner;
public class array_palindrome_1D {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a[] = {1,2,3,2,1};
        int i=0;
        int j=a.length-1;
        boolean isPalindrome = true;

        while(i<j){
            if (a[i] != a[j]){
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("It is palindrome array");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}


