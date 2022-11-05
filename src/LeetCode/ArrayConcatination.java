package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayConcatination
{
    public static int[] getConcatenation(int[] nums)
    {
        int newArray []= new int[nums.length*2];
        for (int i=0;i< nums.length;i++)
        {
            newArray[i]=nums[i];
            newArray[i+ nums.length]=nums[i];

        }
        return newArray;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x={0,2,1,5,3,4};
        int[] z=getConcatenation(x);
        System.out.println("Result is: ");
        for(int y:z)
        {
            System.out.print(y+",");
        }


    }
}
