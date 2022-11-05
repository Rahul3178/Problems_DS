package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] x = {{1,5},{7,3},{3,5}};

        for(int i=0;i<x.length;i++)
        {
            for (int j=0;j<x[i].length;j++)
            {
                System.out.println("Result is: "+x[i][j]);

            }


        }


    }
}
