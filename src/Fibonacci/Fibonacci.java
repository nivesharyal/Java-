package Fibonacci;

public class Fibonacci {
    public void fibonacciSeries(){
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b);
        for(int i=1;i<10;i++){
            c=a+b;
            System.out.print(" "+c);
            a = b ;
            b = c ;
        }
    }
}
