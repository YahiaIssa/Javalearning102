package Java102;

public class Main {
    public static void main(String[] args) {

        AnotherCalc calc = new AnotherCalc();
        double result = calc.Add();
        System.out.println(result);
        System.out.println("_______");


        calc.setX(3);
        calc.setY(5);


        result = calc.Add();
        System.out.println(result);
        System.out.println("_______");


        result = calc.Multiply();
        System.out.println(result);
        System.out.println("_______");


        result = calc.Division();
        System.out.println(result);
        System.out.println("_______");
        System.out.println(calc.getX());
        System.out.println("_______");
        System.out.println(calc.getY());
    }
}