package Java102;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double result=0.0;
        try {
     result =  Calcuator.Div(10.5,0);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Div by zero");
        }
        System.out.println(result);
    }
}