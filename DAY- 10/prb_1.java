package day10;
public class prb_1 {
    public static void main(String[] args) {
        String name = "hello world";// helleh
        char[] arr = name.toCharArray();
        int Start = 0, End = arr.length - 1;
        while (Start <= End){
            char temp=arr[Start];
            arr[Start]=arr[End];
            arr[End]=temp;
            Start++;
            End--;
        }
        String s=new String(arr);
        System.out.println(arr);// palindrome check in string sop.(name.equals(s)?"yes":"no");
    }
}

