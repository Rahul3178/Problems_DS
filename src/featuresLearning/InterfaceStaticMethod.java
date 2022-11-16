package featuresLearning;

public class InterfaceStaticMethod implements newLeft
{
    public static void main(String[] args) {
        InterfaceStaticMethod f= new InterfaceStaticMethod();
        // compile time f.m1();
        newLeft.m1();
        System.out.println("Main class Static method");

    }
}
interface newLeft{
    public static void m1()
    {
        System.out.println("Static method inside interfce");
        // static methods are not available to implementation class we have to call with the name of interfce other wise we get compile time error
        // we cant override but if we do its valid but not override concept
        // we can also write main method inside interface

    }

    public static void main(String[] args) {
        System.out.println("Interface static method");
        // its not overriding
    }
}

