package LeetCode;

import javax.print.DocFlavor;

public class P_2114_Maximum_word_Count
{
    public static void main(String[] args) {
        String arr[]={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int res=mostWordsFound(arr);
        System.out.print("Result:"+res);
    }

    private static int mostWordsFound(String[] arr)
    {
        int maximum_Count=0;
        for(int i=0;i< arr.length;i++)
        {
            int wordCount=0;
            String res=arr[i];
            for(char c:res.toCharArray())
            {
                if(c==' ')
                {
                    wordCount++;
                }
            }
            if(maximum_Count<wordCount)
            {
                maximum_Count=wordCount;

            }

        }

        return maximum_Count+1;
    }
}
