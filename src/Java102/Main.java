package Java102;

import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Circle a = new Circle();
        Triangle b = new Triangle();
        Rectangle c = new Rectangle();
        A shape = new A();
        Square d = new Square();
        shape.DrawShape(d);
        shape.DrawShape(b);
        a.Draw();
        b.Draw();
        c.Draw();
    }

}