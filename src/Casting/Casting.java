package Casting;

public class Casting {
    public void wideningCasting(){
        int myInt = 5;
        double myDouble = myInt;
        System.out.println(myDouble);

    }
    public void narrowingCasting(){
        double myDouble = 3.14d;
        int myInt = (int)myDouble;
        System.out.println(myInt);
    }
}
