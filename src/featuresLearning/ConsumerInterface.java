package featuresLearning;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerInterface
{
    public static void main(String[] args) {
       IntConsumer c= s->System.out.println(s);
        c.accept(5);
    }
}
