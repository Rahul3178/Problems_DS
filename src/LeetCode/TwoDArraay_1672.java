package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDArraay_1672 {
    public static int maximumWealth(int[][] accounts)
    {
        int max_Wealth=0, total=0;
        for(int i=0;i<accounts.length;i++)
        {
            for (int j=0;j<accounts[i].length;j++)
            {
                total+=accounts[i][j];

            }
                System.out.println("Customer :"+total);
            if(max_Wealth<total)
            {
                max_Wealth=total;

            }else
            {
                max_Wealth=max_Wealth;
            }
            total=0;
        }
        return max_Wealth;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] x = {{2,8,7},{7,1,3},{1,9,5}};

        int z = maximumWealth(x);
        System.out.println("Result is: "+z);

    }
}
