package StaticEx;

public class StaticExample {

    int rollNo;
    String name;
    static String collegeName="Deerwalk";

    StaticExample(int rollNo,String name){
        this.name=name;
        this.rollNo=rollNo;
    }
    public void display(){
        System.out.println("name is "+name+" roll no is "+rollNo+ " collegeName is "+collegeName);
    }
     public static void  changename(){
        collegeName= "DeerHold";
         System.out.println(collegeName);
     }
}
