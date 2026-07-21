package day10;

public class append {
    public static void main(String[] args){
        StringBuilder name=new StringBuilder("hello");
        name.append("world");
        name.insert(2,100);
        System.out.println(name);
    }
}
