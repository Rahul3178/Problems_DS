package LeetCode;

import java.util.*;
public class NumReverse
{
    public static int reverseOfNumber(int x)
    {

        int reverse=0 ,rem=1;

        int flag=(x>0)? 1 :-1;
        x=(flag==-1) ?-x:x;
        if( (x>=Integer.MAX_VALUE/10)|| (x<=Integer.MAX_VALUE/10))
        {
            return 0;
        }

        while(x!=0)
        {
            rem=x%10;
            reverse=reverse*10+rem;
            x=x/10;


            if(reverse>=Integer.MAX_VALUE/10 || reverse<=Integer.MAX_VALUE/10 )
            {

                return 0;
            }


        }

        return reverse*flag;

    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int y=sc.nextInt();
        System.out.println("Result is: "+y);
        int z=reverseOfNumber(y);
        System.out.println("Result is: "+z);
    }
}