package featuresLearning;

import java.util.function.Predicate;

public class predicateInterface implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if(integer>0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        predicateInterface f= new predicateInterface();
        System.out.println(f.test(5));
    }
}
