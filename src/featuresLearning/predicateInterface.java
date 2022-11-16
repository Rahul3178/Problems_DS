package featuresLearning;

import java.util.function.Predicate;

public class predicateInterface  {



    public static void main(String[] args) {
       // predicateInterface f= new predicateInterface();
        /*Predicate<Integer> p=(i)->{
          if(i>10)
          {
              return true;
          }
          else{
              return false;
          }
        };*/

        // we can also do
        Predicate<Integer> p=(i)->i>10;

        // prediacte<T> is a functional interface with test() abstract method 1.e we can use lambda expression
        System.out.println("Result: "+p.test(5));
    }
}
