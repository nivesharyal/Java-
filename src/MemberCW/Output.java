package MemberCW;

public class Output {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Nivesh");
        employee.setAge(29);
        employee.setPhoneNumber(9841078902.);
        employee.setAddress("Baneshwor");
        employee.setSalary(500000);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getPhoneNumber());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());
    }
}
