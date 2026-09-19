package Lab1;

/* Comp3111Lex\Lab1\mainApp1.java
Main application for Lab1 exercise */

public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println("Hi, I'm a calculator!");
        System.out.println("Program. . . Starting. . . ");
        System.out.println("1 plus 1 is " + 2);
        System.out.println(b+" to the power of "+n+" is "+ myLibrary.Power(b,n));
        System.out.println(n+"! is " + myLibrary.factorial(n));
        System.out.println("Program. . . Ended. . . ");
        System.out.println("Thanks for using me!");
    }
}
