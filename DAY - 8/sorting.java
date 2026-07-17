package day8;
import java.util.Scanner;
public class sorting {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int []arr={1,3,2,4,7,9,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[i]=temp;
                }
            }
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
