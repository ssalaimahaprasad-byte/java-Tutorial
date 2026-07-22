package day11;
import java.util.Scanner;
public class Longest_word_string{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="Today is a java class";
        String []arr=s.split(" ");
        String longworld=arr[0];
        for(String l:arr){
            if(l.length()>longworld.length()){
            longworld=s;
            }
        }
        System.out.println(longworld);
    }
}
