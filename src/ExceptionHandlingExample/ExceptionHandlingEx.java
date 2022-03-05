package ExceptionHandlingExample;

import java.nio.channels.ScatteringByteChannel;

public class ExceptionHandlingEx {

    public void divide()
    {

        try{
        int a = 5;
        int b = 0;
        int c = a/b;
            System.out.println("Value is :"+c);
    } catch (ArithmeticException e)
        {
            //e.printStackTrace();

        System.out.println("Cannot divide by 0");
    } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();

    }
    finally {
        System.out.println("It is executed");
    }



}}
