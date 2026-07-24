package day13;
class Ar {   //super class
    void display(){
        System.out.println("Hellow salai");
    }
}
class Be extends Ar{
    void display() {
        System.out.println("welcome to salai home");
    }
}
class C extends Be {
    void cafaee() {
        System.out.println("welcome to salai cafaee");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Ar a = new Ar();
        Be b = new Be();
        C c = new C();
        c.cafaee();
        b.display();
        a.display();
    }
}

