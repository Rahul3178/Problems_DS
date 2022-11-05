package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySufflingP_1470
{
    public static int[] shuffle(int[] nums, int n)
    {
        int newArray[]= new int[nums.length];
        int k=0;
         for(int i=0,j=n;i<n || j<=nums.length-1;)
        {
            newArray[k]=nums[i];
            newArray[++k]=nums[j];
            i++;
            j++;
            k++;
        }
        return newArray;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x={2,5,1,3,4,7};
        int n=3;
        int[] z=shuffle(x,n);
        System.out.println("Result is: ");
        for(int y:z)
        {
            System.out.print(y+",");
        }


    }
}
