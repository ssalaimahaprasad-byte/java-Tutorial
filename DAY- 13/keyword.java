package Day13;

class A{
    A(){
        super();
        System.out.println("print the value of a");

    }
    A(int a){
        this();
        System.out.println("print the value of"+a);
    }

}
class B extends A{
    B(){

    }
    B(int a,int b){
        this();
        System.out.println("enter the value b"+a);
    }
    B(int a){
        this();
        System.out.println("enter the value"+a);
    }
}
public class keyword {
    public static void main(String[]args){
        //A obj1=new A(10);
        B obj2=new B(2);

    }
}

