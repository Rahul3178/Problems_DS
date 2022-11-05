import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.io.*;

public class RomanToInteger
{

    public static Map<Character, Integer> rom= new HashMap<>();

    public static int romanToInt(@NotNull String s) {
        int ans = 0, num,prev= 0;

        for (int i = s.length()-1; i >= 0; i--)
        {
           num=rom.get(s.charAt(i));
            if (num < prev) {
                ans -= num;
            }
            else {
                ans += num;
            }
            prev = num;
        }
        return ans;
    }


    public static void main(String[] args) throws Exception
    {
        rom.put('V',5);
        rom.put('I',1);
        rom.put('X',10);
        rom.put('L',50);
        rom.put('C',100);
        rom.put('D',500);
        rom.put('M',1000);

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Roman Number :");
        String roman=br.readLine();
        System.out.println("Entered by me:"+roman);
        int number =romanToInt(roman);
        System.out.println("Result is : "+number);

    }


}