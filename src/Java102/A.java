package Java102;

import java.util.InputMismatchException;

public class A {

    public void Draw(int val)
    {
        if (val==0)
            return;
        for (int i = 0; i < val ; i++)
               System.out.print("@");

            System.out.println("%");
            Draw(val - 1);
        System.out.println("End DRAW"+val);

    }


}
