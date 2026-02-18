package Java102;

import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int x, y, sum;
//            try {
//                System.out.print(" Enter x :");
//                x = scn.nextInt();
//                System.out.print(" Enter y :");
//                y = scn.nextInt();
//                sum = x / y;
//                System.out.println("x+y=" + sum);
//
//
//            } catch (InputMismatchException e) {
//                System.out.println("InputMismatchException ");
//                return;
//            } catch (ArithmeticException ae) {
//                System.out.println("ArithmeticException");
//                System.out.println(ae);
//            }
//
//            finally {
//
//                System.out.println("Done");
//            }
//        A f=new A();
//        System.out.println(f.fun());

        A x = new A();
        try {
            x.setMaxValue(200);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}

