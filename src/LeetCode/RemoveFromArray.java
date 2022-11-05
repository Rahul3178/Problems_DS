package LeetCode;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
// array should be shorted in ascending order
public class RemoveFromArray
{
    public static int removeDuplicates(int @NotNull [] nums)
    {
        if(nums== null || nums.length==0)
        {
            return 0;
        }
        if(nums.length==1) return 1;
        int distinctElement=1 ,replaceIndex=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(i>replaceIndex)
                {
                    nums[replaceIndex]=nums[i];
                }
                distinctElement++;
                replaceIndex++;
            }

        }
        return distinctElement;
    }
    // time complexity O(nums) -> depends on number of elements in an array.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner((System.in));
        System.out.print("Enter Value: ");
        int [] input= {1,1,2};
        System.out.println("Result:" + removeDuplicates(input));

    }
}
