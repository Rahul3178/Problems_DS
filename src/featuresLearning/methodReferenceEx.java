package featuresLearning;

public class methodReferenceEx
{
    public static void main(String[] args) {

    Runnable r=()->{
        for (int i = 0; i <=10; i++) {
            System.out.println("Fromlambda Expression: "+i);
        }
    };
    Thread t= new Thread(r);
    t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}