package Day13;
class animals{
    void sound(){
        System.out.println("sound made by animals");
    }
}
class dog extends animals{
    void sound(){
        System.out.println("bow bow");

    }
}
class cat extends animals{
    void sound(){
        System.out.println("meow meow");
    }
}
class crow extends animals{
    //void sound(){
    //System.out.println("kahh kahh");
    // }
}

public class overriding {
    public static void  main (String[]args){
        animals obj=new animals();
        obj.sound();
        dog obj1=new dog();
        obj1.sound();
        cat obj2=new cat();
        obj2.sound();
        crow obj3=new crow();
        obj3.sound();
        //if we didnot give any sout in the calling class it will give the parent class sout as a output when u call any one class in multiple subclass



    }
}