package day14;
interface A{

    void a();// create only abstract method not normal method and error
}
interface C extends A{
    void display();


}
class B implements C{// using two interface
    public void a(){
        System.out.println("h");
        
    }
}


