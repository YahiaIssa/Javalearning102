package Java102;

public class Main {
    public static void main(String[] args) {
//        A z = new A();
//        A r = new A();
//        z.x=10;
//        r.x=7;
//
//        A.y=77;
//        System.out.println(z.y);
//        System.out.println(r.y);
       int result = A.Add(10,40);
        System.out.println(result);
        result = A.Sup(10, 40);
        System.out.println(result);
        result=A.Mul(10,40);
        System.out.println(result);
        result=A.Div(10,40);
        System.out.println(result);

    }
}