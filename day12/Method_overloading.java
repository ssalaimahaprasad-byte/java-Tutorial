package day12;
class E{
    int E(){
        return 1;
    }
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    void display(){
        System.out.println("hello salai");
    }
}
public class Method_overloading {
    public static void main(String[] args){
        E e=new E();//stored value
        int s=e.E();// access value
        System.out.println(e.add(1,2,3));
        System.out.println(e.add(1,2));
    }
}
