package day12;
import java.util.Scanner;
class S{
    int rev_int() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int R=sc.nextInt();
        int rev=0;
        while(R!=0){
            int o=R%10;
            rev=rev*10+o;
            R /=10;
        }
        return rev;/// return panumpothu rev tha kudukanum
    }
}
public class reverse_method {
    public static void main(String[] args){
        S f=new S();//obj is f
        System.out.println(f.rev_int());
    }
}
