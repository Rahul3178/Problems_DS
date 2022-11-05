package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayPermutation
{
    public static int[] buildArray(int[] nums) {
        int result[]= new int[nums.length];
        for(int i=0;i< nums.length;i++)
        {
            result[i]=nums[nums[i]];
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x={0,2,1,5,3,4};
        int[] z=buildArray(x);
        System.out.println("Result is: ");
        for(int y:z)
        {
            System.out.print(y+",");
        }


    }
}
