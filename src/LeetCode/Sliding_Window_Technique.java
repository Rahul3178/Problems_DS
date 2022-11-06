package LeetCode;

public class Sliding_Window_Technique
{

    public static void main(String[] args) {
        int arr[]={1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int key=4;
        int n= arr.length;
        int z=slider(arr,key,n);
        System.out.print("Result:"+z);
        /*for (int res:z)
        {
            System.out.print(res+",");
        }*/
    }

    private static int slider(int[] arr, int key, int n)
    {
        if(n<key)
        {
            return -1;
        }
        int max_sum=0;
        // compute the sum of first window of size k
        for (int i=0;i<key;i++)
        {
            max_sum=max_sum+arr[i];
        }
        //Compute sum of remaining windows by removing first element of previous window and adding last element of current window.
        int window_sum=max_sum;
        for(int i=key;i<n;i++)
        {
          window_sum=window_sum+arr[i]-arr[i-key];
          max_sum=Math.max(max_sum,window_sum);
        }
        return max_sum;
    }
}
