package featuresLearning;

public class threadRunnable
{
    public static void main(String[] args) {
        Runnable r= new demo();
        Thread t= new Thread(r);
     //   t.start();
        t.run();
        for (int i = 0; i <5; i++) {
            System.out.println("main thread" +i);
        }
    }
}
class demo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child class thread" +i);
        }
    }
}
