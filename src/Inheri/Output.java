package Inheri;

public class Output {
    public static void main(String[] args) {
        Teacher2 teacher2 = new Teacher2();
        Teacher3 teacher3 = new Teacher3();
        System.out.println(teacher2.subName);
        System.out.println(teacher3.superSubName);
        teacher2.display();
        teacher3.display();
    }
}
