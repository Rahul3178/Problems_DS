package LeetCode;

import java.util.Scanner;

public class FindSortedArray_P34
{
    public static int[] searchRange(int[] nums, int target)
    {
        int result[]=new int[2];
        result[0]=findFirstIndex(nums,target);
        result[1]=findLastIndex(nums,target);

     return result;
    }

    private static int findLastIndex(int[] nums, int target)
    {
        int l=0,h= nums.length-1;
        int idx=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]==target)
            {
                idx=mid;
            }
            if(target>=nums[mid])
            {
                l=mid+1;
            }else {
                h=mid-1;
            }
        }
        return idx;
    }

    private static int findFirstIndex(int[] nums, int target) {
        int l=0,h= nums.length-1;
        int idx=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]==target)
            {
                idx=mid;
            }
            if(target>nums[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return idx;
    }
    // Binary Search recursive approachyes

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[] num={5,7,7,8,8,10};
        int t=8;
        int[] z=searchRange(num,t);
        System.out.println("Result is: ");
        for(int y:z)
        {
            System.out.print(y+",");
        }
    }
}
// Not working in nall scenario; hence rejected;