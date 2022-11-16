package LeetCode;

public class P_1512_NumbersOfGoodPairs
{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,3};
        System.out.print("Result: "+numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] nums)
    {
        /*int count=0;
        for(int i=0,j=1;i<nums.length && j<nums.length;i++,j++)
        {
            if(i<j && nums[i]==nums[j])
            {
                count++;
            }

        }
        return count;*/

        int res = 0, count[] = new int[101];
        for (int a: nums) {
            System.out.print(res+",");

            res += count[a]++;
            System.out.print(count[a]+",");
        }
        return res;
    }
}
