package SuperKeyword;

public class ChildClass extends ParentClass {
    public String name = "Child";
    public void display(){
       // System.out.println(name);
        System.out.println(super.name);
        super.example();
    }
    public void example(){
        System.out.println("this is example");
    }
}
