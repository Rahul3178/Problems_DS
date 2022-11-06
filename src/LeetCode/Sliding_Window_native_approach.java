package LeetCode;

public class Sliding_Window_native_approach
{

    public static void main(String[] args) {
        int arr[]={1,4,2,10,2,3,1,0,20};
        int key=4;
        int n= arr.length;
        System.out.println("Result: "+maxSum(arr,key,n));
    }

    private static int maxSum(int[] arr, int key, int n) {
        int max_sum=Integer.MIN_VALUE;

        for (int i=0;i<n-key+1;i++)
        {
            int current_sum=0;
            for (int j=0;j<key;j++)
            {
                current_sum+=arr[i+j];

                max_sum=Math.max(current_sum,max_sum);
            }
        }
            return max_sum;
    }
}
