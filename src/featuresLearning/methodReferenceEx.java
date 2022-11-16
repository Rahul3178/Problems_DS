package featuresLearning;

// with method reference
public class methodReferenceEx
{
    public static void m1()
    {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Child thread: "+i);
        }
    }
    public static void main(String[] args) {
    Runnable r= methodReferenceEx::m1;

    Thread t= new Thread(r);
    t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
/*
* in above example runnable interface run() method referring to main class\
* static method m1() .
* Method reference to instance method.
* */