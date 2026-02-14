package Java102;

public class A {
    public int x;
    public static int y;

    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Sup(int a, int b) {
        return a - b;

    }

    public static int Mul(int a, int b) {
        return a * b;

    }

    public static int Div(int a, int b) {
        if (a == 0)
            return 0;
        return a / b;

    }


}
