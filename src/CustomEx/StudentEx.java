package CustomEx;

public class StudentEx  {

  //  public StudentEx(String s){
    //    super(s);
    //}

    public void checkAge(int age) throws AgeException {
            if (age < 18) {
                throw new AgeException("Cannot Vote");
            } else {
                System.out.println("You can vote");
            }
        }
    }

