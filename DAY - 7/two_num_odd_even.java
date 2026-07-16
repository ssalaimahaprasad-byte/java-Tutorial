package day7;
import java.util.Scanner;
public class two_num_odd_even {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[]id={12,50,5,666,222,777};
        int evensum=0;//even 666+222=888
        int oddsum=0;//odd 12+50+777+5=844
        // this the method to calculate.

        for(int num:id){
            int org=num;
            int count=0;

            while(num!=0){
                int pop=num%10;
                count+=pop;
                num/=10;
            }
            if(count%2==0){
                evensum+=org;//even sum and odd sum + seperate and get it.
            }
            else{
                oddsum+=org;
            }
        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }

}
