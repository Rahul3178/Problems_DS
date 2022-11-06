package LeetCode;

// Defuse the bomb

public class Array_P1652
{
    public static int[] decrypt(int[] code, int key)
    {
        int result[]= new int[code.length];
        int front=0,end= result.length-1;

        if(key==0)
        {

            while(front<result.length)
            {
                result[front]=0;
                front++;
            }
            return result;
        } else if (key>0)
        {

            for(int i=0;i<result.length;i++)
            {
                result[i]=sumOfNext(code,key,i);
                System.out.print(result[i]+",");

            }
            System.out.print("\n");

        }

        return result;
    }
    private static int sumOfNext(int arr[],int key,int element)
    {
        int sum=0;
        element+=1;
        while(element<=key)
        {

            sum+=arr[element];
            element++;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int arr[]={5,7,1,4};

        int key=3;
        int z[]=decrypt(arr, key);
        System.out.println("Result: ");
        for (int r:z)
        {
            System.out.print(r+",");
        }


    }
}
