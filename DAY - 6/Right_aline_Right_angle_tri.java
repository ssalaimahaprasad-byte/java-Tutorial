package day6;

import java.util.Scanner;

public class Right_aline_Right_angle_tri {
    public static void main(String[] args) {
            Scanner sr = new Scanner(System.in);
            int n=5;
            for(int i=0;i>n;i++){
                for(int j=1;j<n;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
