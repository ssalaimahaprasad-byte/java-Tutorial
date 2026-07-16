package day7;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        int temp=arr[0];
        arr[0]=arr[4];
        arr[4]=temp;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
