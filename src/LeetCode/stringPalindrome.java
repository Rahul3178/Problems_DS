package LeetCode;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringPalindrome
{
    public static boolean isPalindrome(@NotNull String s)
    {
        String m=s.toUpperCase().trim().replaceAll("[^A-Za-z0-9]", "");
        char[] ch= m.toCharArray();
        System.out.println(m);
        int i=ch.length-1,j=0;
        char temp;
        while(j<=i)
        {
           temp= ch[j];
            ch[j]=ch[i];
            ch[i]=temp;
            i--;
            j++;
        }
        // toString method

        for (char z:ch )
        {
            System.out.print(z);
        }
        return m.equals(new String(ch));




    }



    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Value: ");
        String input=br.readLine();
        System.out.println("String value:"+isPalindrome(input));

    }
}
