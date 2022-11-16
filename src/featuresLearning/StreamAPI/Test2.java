package featuresLearning.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// program for map() and collect Method
public class Test2
{
    public static void main(String[] args) {
        ArrayList<String> a1= new ArrayList<>();
        a1.add("rvk");
        a1.add("rk");
        a1.add("rkv");
        a1.add("rvki");
        a1.add("rvkir");
        System.out.println(a1);

        List<String> l1= a1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l1);
        long count =a1.stream().filter(s->s.length()>0).count();
        System.out.println(count);

        // sorted methods

        /* if we sort the element present inside stream then we should go for sorted() method.
        *the sorting can either default natural sorting order or customized sorting order specified by comparator.
        * sorted()->default natural sorting order
        * Sorted(Comprator c)-> customized sorting order
        *
        * */
        List<String> l2=a1.stream().sorted().collect(Collectors.toList());
        System.out.println(l2);//-> default natural sorting

        List<String> l3=a1.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(l3);

        // processing min() and max()

        /*
        *  min(comprator c)
        * max (Comprator C)
        *
        * */

        String min=a1.stream().min((s1,s2)->s1.compareTo(s2)).get();
        System.out.println(min);
        String max=a1.stream().max((s1,s2)->s1.compareTo(s2)).get();
        System.out.println(max);
    }
}
