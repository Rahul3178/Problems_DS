package featuresLearning.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3foreach
{
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(0);
        a1.add(5);
        a1.add(10);
        a1.add(15);
        a1.add(20);
        a1.add(25);
        a1.add(30);
        a1.add(35);
        a1.add(40);
        a1.add(45);
        System.out.println(a1);

        List<Integer> l1= a1.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println(l1);
        List<Integer>l2= a1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);

        List<Integer> l3= a1.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);
        Comparator<Integer> comp=(i1,i2)->i1.compareTo(i2);
        List<Integer> l4=a1.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(l4);
        Integer min= a1.stream().min(comp).get();
        Integer max=a1.stream().max(comp).get();
        System.out.println(min);
        System.out.println(max);
        System.out.println("for each using lambda expression");
        a1.stream().forEach(i->System.out.print(i+","));
        System.out.println("using method reference");
        l4.stream().forEach(System.out::print);

        System.out.println("\n"+"Converting to array using method reference");

        Integer[] ar=a1.stream().toArray(Integer[] :: new);
        for (Integer i:ar
             ) {
           System.out.print(i+",");
        }

        System.out.print("\n Stream of method \n");
        Stream s1= Stream.of(ar);
        s1.forEach(System.out::println);

        Stream s= Stream.of(99,999,9999,99999);
        s.forEach(System.out::println);


    }
}
