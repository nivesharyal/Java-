package CustomEx;

public class Output {
    public static void main(String[] args) {
        StudentEx studentEx = new StudentEx();
        try {
            studentEx.checkAge(15);
        }catch (AgeException e){
            System.out.println(e.getMessage());;
        }
    }
}
