package LeetCode;

public class BinarySearch
{
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
                binarySearch(arr,mid+1,u,target);
            }else {
                binarySearch(arr,0,mid-1,target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={0,1,12,15,16,23,25,34};
        int target=15;
        int z=binarySearch(nums,0, nums.length-1,target);
        System.out.print("Result : "+z);
    }


}
