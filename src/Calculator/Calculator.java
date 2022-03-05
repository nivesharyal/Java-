package Calculator;

import Switch.Switch;

import java.util.Scanner;

public class Calculator {
    public void Calculation() {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st no :");
            int no1 = s.nextInt();
            System.out.println("Enter 2nd no :");
            int no2 = s.nextInt();
            System.out.println("Enter symbol (+,-,*,/)");
            String sym = s.next();
            int res;
            switch(sym)
            {
                case"+":
                res = no1 + no2;
                System.out.println("Addition of two no :" + res);
                break;
                case"-":
                res = no1 - no2;
                System.out.println("Subtraction of two no :" + res);
                break;
                case"*":
                res = no1 * no2;
                System.out.println("Multiplication of two no :" + res);
                break;
                case"/":
                res = no1 / no2;
                System.out.println("Division of two no :" + res);
                break;
                default:
                    System.out.println("Invalid Symbol");
                    break;
            }
            System.out.println("Do you want to continue(Press y for Yes and n for No)");
              yn=s.next();

        } while (yn.equals("y") || yn.equals("Y"));

    }
}