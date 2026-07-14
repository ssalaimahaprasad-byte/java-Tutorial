package day5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter a number:");
        int b=sr.nextInt();
        int sum=0;
        int oddsum=0;
        int evensum=0;
        while(b!=0){
            int pop =b%10;
            if (pop%2 == 0) {
                evensum+=pop;
            }
            else{
                oddsum+=pop;
            }
            sum+=pop;
            b=b/10;
        }
        System.out.println("Enter a sum:"+sum);
        System.out.println("Enter a oddsum:"+oddsum);
        System.out.println("Enter a evensum:"+evensum);
    }

}
