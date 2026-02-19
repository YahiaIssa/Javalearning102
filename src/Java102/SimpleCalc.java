package Java102;

import java.util.Scanner;

public class SimpleCalc {
    private int x;
    private int y;

    private Scanner scan;

    public SimpleCalc() {
        this.scan = new Scanner(System.in);
        System.out.println("Please Enter the first number : ");
        this.x = this.scan.nextInt();
        System.out.println("Please Enter the seconde number : ");
        this.y = this.scan.nextInt();
    }

    public final int Add() {
        Math.max(x,y);

        return this.x + this.y;
    }

    public final int sup() {
        return this.x - this.y;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int b) {
        this.y = b;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}