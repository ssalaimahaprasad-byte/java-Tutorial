package day13;
class A{   //super class
    void display(){
        System.out.println("Hellow salai");
    }
}
class B {
    void display() {
        System.out.println("welcome to salai home");
    }
}
public class inheritance {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        b.display();
    }
}
