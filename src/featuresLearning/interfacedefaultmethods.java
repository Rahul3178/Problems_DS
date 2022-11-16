package featuresLearning;

import java.util.logging.Level;

public class interfacedefaultmethods implements left,right
{
   @Override
    public void m1()
    {
        //System.out.println("Override inside main");
        left.super.m1();
        right.super.m1();
    }
    public static void main(String[] args) {
        interfacedefaultmethods i= new interfacedefaultmethods();
       i.m1();

    }
}
interface left{
    default void m1()
    {
        System.out.println("Default method inside left  interface");
        // there are by default available to implementation class that why we can overide those methods

    }
}

interface right{
    default void m1()
    {
        System.out.println("Default methiod inside right interface");
    }
}