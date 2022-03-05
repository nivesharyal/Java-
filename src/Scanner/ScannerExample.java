package Scanner;

import java.util.Scanner;

public class ScannerExample {
    public void scannerEx(){
        System.out.println("Enter no : ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Your no is "+b);
    }
        public void scannerExs(){
            System.out.println("Enter 1st no : ");
            Scanner sc2 = new Scanner(System.in);
            int a = sc2.nextInt();
            System.out.println("Enter 2nd no : ");
            int b = sc2.nextInt();
            int sum = a + b;
            System.out.println("Sum is " +sum);
        }
    public void userDetail(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = s.next();
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        System.out.println("Enter your gender : ");
        char gender = s.next().charAt(0);
        System.out.println("Enter your phone no : ");
        long phno = s.nextLong();
        System.out.println(".........................");
        System.out.println(" Name :"+name);
        System.out.println(" Age :"+age);
        System.out.println(" Gender :"+gender);
        System.out.println(" Phone no :"+phno);


    }

}
