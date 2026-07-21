package day10;

public class Strings {
    public static void main(String[] args){
        StringBuilder name =new StringBuilder("Hello");
        StringBuilder name1=new StringBuilder("hello");
        String name2=name.toString();
        String name3=name.toString();
        System.out.println(name2==name3);
    }
}
