package Java102;

public class SimpleCalc {
    private int x;
    private int y;

    public SimpleCalc() {
        this.x = 1;
        this.y = 5;
    }

    public SimpleCalc(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public final int Add() {
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
