package Java102;

public class AnotherCalc extends SimpleCalc{

    public AnotherCalc()
    {
        super();
    }
    public AnotherCalc(int a,int b)
    {
        super(a,b);
    }
    public int Multiply()
    {
     return this.getX() * this.getY();

    }
    public double Division()
    {
        int y=this.getY();
        if (y==0)
            return 0;
        return (double) this.getX()/this.getY();
    }

}
