package LeetCode;

public class P_2011_Operation
{
    public static void main(String[] args) {
        String[] arr={"X++","++X","--X","X--"};

        System.out.print("Result:"+finalValueAfterOperations(arr));

    }

    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        int i=0;
        while(i<operations.length)
        {
            String s=operations[i];
            if(s.equalsIgnoreCase("X++"))
            {
                x++;

            } else if (s.equalsIgnoreCase("X--")) {
                x--;

            } else if (s.equalsIgnoreCase("++X")) {
                ++x;

            }else {
                --x;

            }
            i++;
        }
        return x;
    }
}
