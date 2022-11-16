package LeetCode;

public class P_1480_RunningSum
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int z[]=runningSum(arr);
        System.out.println("Result: ");
        for (int k:z) {
            System.out.print(k+",");
        }
    }

    private static int[] runningSum(int[] arr)
    {
        int runningSum=0,i=0;
        int result[]=new int[arr.length];
        while(i< arr.length)
        {
            runningSum+=arr[i];
            result[i]=runningSum;
            i++;
        }
        return result;
    }
}
