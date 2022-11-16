package LeetCode;

public class finterface
{
    public static void main(String[] args) {
        myface f= new demo();
        f.show();
    }


}

interface  myface {
    abstract void show();
}

class demo implements myface{

    @Override
    public void show() {
        System.out.println("Hello Rahul");
    }
}