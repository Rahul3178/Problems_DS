package featuresLearning;

import java.util.function.Function;

public class FunctionInterface
{
    // Write a function to find a length of given string
    // apply is a abstract method -> we use lambda expression
    public static void main(String[] args) {
        Function<String, Integer> f= s->s.length();
        Function<String, String> f1= s->s.toUpperCase();
        Function<Integer, Integer> f2= s->s*s;
        System.out.println(f.apply("Rahul"));
        System.out.println(f.apply("Kumar"));
        System.out.println(f.apply("Jangra"));
        System.out.println(f1.apply("Jangra"));

        System.out.println(f1.andThen(f).apply("Jangra"));
        System.out.println(f.andThen(f2).apply("Rahul"));
        System.out.println(f.compose(f1).apply("jangra"));
    }
}
