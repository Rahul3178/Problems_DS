package LeetCode;

import java.util.ArrayList;

public class fInterface2
{
    public static void main(String[] args) {
        // using lambda expression to iterate  inside array list
        // we pass lambda expression as an argument
        ArrayList<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(23);
        a.add(3);
        a.add(23);
        a.add(98);

        a.forEach((n)->System.out.println(n));
    }
}
