package Java102;

public class Main {
    public static void main(String[] args) {

        SimpleCalc calc = new SimpleCalc(2, 5);

        int result = calc.Add();
        System.out.println(result);
        calc.setX(15);
        calc.setY(8);
        result = calc.Add();
        System.out.println(result);

    }
}