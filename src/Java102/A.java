package Java102;

public class A {

    public void setMaxValue(int val) throws Exception
    {
//        try {
            if (val > 100)
                throw new Exception("Val overflow");
            System.out.println(val);
//        } catch (Exception e) {
//
//            System.out.println(e.getMessage());
//        }

    }


}
