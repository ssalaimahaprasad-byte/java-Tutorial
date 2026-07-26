package day14;
abstract class emp {
    protected String name;
    protected int id;
    protected int base_salary;

    emp(String name, int id, int base_salary) {
        this.name = name;
        this.id = id;
        this.base_salary = base_salary;
    }

    abstract void bonus();
}
class manager extends emp{
        manager(String name,int id,int base_salary){
            super(name,id,base_salary);
    }
    void bonus(){
        System.out.println(base_salary+base_salary*0.10);
    }
}
class developer extends emp{
        developer( String name,int id,int base_salary){
            super(name,id,base_salary);
    }
    void bonus(){
        System.out.println(base_salary+base_salary*0.05);
    }
}
class intern extends emp{
    intern(String name,int id ,int base_salary){
        super(name,id,base_salary);
    }
    void bonus(){
        System.out.println(base_salary);
    }
}
public class mian {
    public static void main(String[] args){
        emp m=new manager("salai",20,1500);
        emp d=new developer("pugal",22,2500);
        emp n=new intern("kavin",19,2998);
        m.bonus();
        d.bonus();
        n.bonus();
    }
}
