package LeetCode;

import java.util.Scanner;

public class FindSortedArray_P34
{
    public static int[] searchRange(int[] nums, int target)
    {
        int result[]={-1,-1};
        if(nums.length==0 || nums.length==1)
        {

            result[0]=0;
            result[1]=0;
            return result;
        }

        System.out.println("Binary Result: "+binarySearch(nums,0, nums.length,target));
     return result;
    }
    // Binary Search iterative approachyes
    public static int binarySearch(int arr[], int l, int u, int target)
    {
        if(l<=u)
        {
            int mid=l+u/2;

            if(arr[mid]==target)
            {
                System.out.print("Mid Value: "+mid);
                return mid;

            }
            if(arr[mid]<target)
            {
                binarySearch(arr,mid,u,target);
            }
            if(arr[mid]>target){
                binarySearch(arr,0,mid-1,target);
            }

        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[] num={0,1,2,3,4,5,6,7};
        int t=4;
        int[] z=searchRange(num,t);
        System.out.println("Result is: ");
        for(int y:z)
        {
            System.out.print(y+",");
        }
    }
}
