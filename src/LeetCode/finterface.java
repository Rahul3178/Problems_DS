package LeetCode;

public class finterface
{
    public static void main(String[] args) {
        myface f=()-> System.out.println("Hello lambda expression");
        f.show();
    }


}
@FunctionalInterface
interface  myface {
    abstract void show();
}

// we only need  finctional interface to use lambda expression;
/*class demo implements myface{

    @Override
    public void show() {
        System.out.println("Hello Rahul");
    }
}*/