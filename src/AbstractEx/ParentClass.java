package AbstractEx;

public abstract class ParentClass {
    public void display(){
        System.out.println("This is parent Method : ");

    }
    //constructor
    ParentClass(){
        System.out.println("This is constructor" );
    }
    //static method
    public static void print(){
        System.out.println("Printing from parent");
    }
    public abstract void display1();
}
