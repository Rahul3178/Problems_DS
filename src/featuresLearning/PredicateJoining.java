package featuresLearning;

import java.util.function.Predicate;

/*
    her we join predicates into single predicate
    and(), or(),negate()
    same as logical and, or , and complement operator
 */
public class PredicateJoining
{
    public static void main(String[] args) {
        int x[]={0,5,10,15,20,25,30};
        Predicate<Integer> p1=i->i>10;
        Predicate<Integer>p2=i->i%2==0;
        System.out.println("The Numbers Greater than 10: ");
        m1(p1,x);
        System.out.println("The Even Numbers are: ");
        m1(p2,x);
        System.out.println("The Numbers Not Greater than 10: ");
        m1(p1.negate(),x);
        System.out.println("The Odd Numbers are: ");
        m1(p2.negate(),x);
        System.out.println("The Numbers are Greater than 10 and EVEN: ");
        m1(p1.and(p2),x);
        System.out.println("The Numbers are Greater than 10 OR EVEN: ");
        m1(p1.or(p2),x);

    }
    public static void m1(Predicate<Integer> p, int x[])
    {
        for (int x1:x)
        {
            if(p.test(x1))
            {
                System.out.println(x1);
            }
        }
    }
}
