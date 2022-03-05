package GettersNSetters;

public class Output {
    public static void main(String[] args) {
        Account a= new Account();
        a.setName("Nimesh");
        a.setAge(29);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.printDetails();
    }
}
