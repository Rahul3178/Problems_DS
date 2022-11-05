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
        int z=binarySearch(nums,0, nums.length-1,target);
        System.out.println("Binary Result: "+z);
     return result;
    }
    private static  int binarySearch(int[]nums,int lw,int up,int target)
    {


            int mid= lw+(up-lw)/2;
           // int mid = lw + up / 2;

            if (nums[mid] == target) {
                System.out.println("mid"+mid);
                return mid;
            }

            if (target < nums[mid]) {
                binarySearch(nums, lw, mid - 1, target);
            } else {
                binarySearch(nums, mid + 1, up, target);
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
