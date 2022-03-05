package Constructor;

import java.lang.reflect.Constructor;

public class Output {
    public static void main(String[] args) {
        Employee e1=new Employee("Nivesh",101);
        Employee e2=new Employee("abc",102);
        e2.display();
        e1.display();
    }
}
