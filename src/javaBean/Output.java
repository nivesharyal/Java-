package javaBean;

public class Output {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        student.setName("Nivesh");
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}
