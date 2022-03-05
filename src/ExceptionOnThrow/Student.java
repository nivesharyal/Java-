package ExceptionOnThrow;

public class Student {

    static void CalculateAge(int age,int weight) throws ArithmeticException{
        if (age<12&&weight<23){
            throw new ArithmeticException("unqualified");
        }else
        {
            System.out.println("qualified");
        }
    }
}
