package Constructor;

  public class Employee {
    String name;
    int emp_id;
    static String companyName="Deerwalk";

    Employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public void display() {

        System.out.println("emp_id is :" + emp_id + " Name is : " + name+" Company name is "+companyName);
    }
}