package Java102;

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.x = 750;
        System.out.println(obj);
        A obj2 = new A();
        System.out.println(obj);

        C Calc = new C(5.2f);
        C Calc2= new C(7.1f);
        C Calc3= new C(8.0f);
        System.out.println(Calc.result);
        System.out.println(Calc2.result);
        System.out.println(Calc3.result);
    }

}