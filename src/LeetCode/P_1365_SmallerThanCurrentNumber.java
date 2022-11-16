package LeetCode;

public class P_1365_SmallerThanCurrentNumber
{
    public static void main(String[] args) {
        int arr[]={7,7,7,7};
        int res[]=smallerNumbersThanCurrent(arr);
        System.out.print("Result: ");
        for (int c:res
             ) {
            System.out.print(c+",");
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums)
    {
        int result[]=new int[nums.length];
        int i=0;
        while(i< nums.length)
        {

            int j=0,count=0;
            while(j< nums.length)
            {
                if(j!=i && nums[j]<nums[i])
                {
                    count++;

                }
                j++;
            }
            result[i]=count;
            System.out.print(result[i]+",");
            i++;
        }
        return result;
    }
}
