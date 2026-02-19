package Java102;

public class MyException extends Exception{

    public MyException (String msg)
    {
        super(msg);
    }

    public MyException()
    {super("value>100");

    }
}
