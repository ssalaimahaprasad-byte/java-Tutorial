/*
package day12;
class c{
    int id;
    String name1;
    c(int id,String name1){
        this.id=id;
        this.name1=name1;
    }
    void display(){
        System.out.println(id+" "+name1+" ");
    }
}
public class Constructor_overloading {
    public static void main(String[] args){
        c c=new c(5,"s");
        c.display();
    }
}
*/
package day12;
class D {
    int id;
    String name;
    String name1;

    D(int id) {
        this.id = id;
    }

    D(String name) {
        this.name = name;
    }

    D(String name1, String name2) {
        this.name1 = name1;
        this.name = name2;
    }

    D(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id+" "+name+" ");
    }
}
public class Constructor_overloading {
    public static void main(String[] agrs) {
        D name = new D(100, "salai");
        name.display();
    }
}
