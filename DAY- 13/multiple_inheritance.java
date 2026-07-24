package Day13;
class a{
    void display(){
        System.out.println("salai");
    }
}
class b extends a{
    void display1(){
        System.out.println("pugal");
    }
}
class c extends a{
    void display2(){
        System.out.println("nithish");
    }
}

public class multiple_inheritance {
    public static void main(String[]args){
        a A=new a();
        b B=new b();
        c C=new c();
        A.display();
        B.display1();
        C.display2();
        B.display();
        C.display();
    }
}