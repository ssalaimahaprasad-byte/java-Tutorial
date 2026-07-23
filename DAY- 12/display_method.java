package day12;
import java.util.Scanner;
class r {
    int a;
    int b;
    String c;
    String d;
    r(int a) {
        this.a = a;
    }
    void display(int a) {
        System.out.println(a);
    }
    r(int b, int x) {
        this.b = b;
    }
    void display() {
        System.out.println(b);
    }
    r(String c) {
        this.c = c;
    }
    void display(String c) {
        System.out.println(c);
    }
    r(String c, String d) {
        this.c = c;
        this.d = d;
    }
    void display(String c, String d) {
        System.out.println(c + " " + d);
    }
}
public class display_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        String d = sc.next();
        r obj1 = new r(a);
        obj1.display(a);
        r obj2 = new r(b, 0);
        obj2.display();
        r obj3 = new r(c);
        obj3.display(c);
        r obj4 = new r(c, d);
        obj4.display(c, d);
    }
}