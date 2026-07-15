package day6;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){// i ku bathil ahh 5 kudutha square la print ahhgum
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

}
