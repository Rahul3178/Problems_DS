package featuresLearning;
// In method and constructor references compulsory the argument type must be matched

class Sample{
    private String s;

    Sample(String s)
    {
        this.s=s;
        System.out.println("Constructor Executed: "+s);
    }
}

// functional interface
@FunctionalInterface
interface myface3{
    public Sample get(String s);
}

public class constructorReference
{
    public static void main(String[] args) {
        myface3 m=s->new Sample(s);
        m.get("From lambda Expression");
        myface3 m2=Sample::new;
        m2.get("From Constructor reference");
    }
}
