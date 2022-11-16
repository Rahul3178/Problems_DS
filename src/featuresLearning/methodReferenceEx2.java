package featuresLearning;

interface myface{
    public void m1(int i);
}

public class methodReferenceEx2
{
    public void m2(int q)
    {
        System.out.println("From Method reference: "+q);
    }

    public static void main(String[] args) {
        myface m=i->System.out.println("From lambda Expression: "+i);

        m.m1(10);

        methodReferenceEx2 ex= new methodReferenceEx2();
        myface m2=ex::m2;
        ex.m2(15);
    }
}

/*
* in the above Example functional interface method m1() referring
*  to main  class instance method m2().
* the main advantage of maethod reference is we can use already existing code to implement functional interfaces(Code re-usability)
* */