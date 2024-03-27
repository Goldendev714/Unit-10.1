import java.util.Scanner;
import java.util.ArrayList;

public class Minimum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        int answer = 0;

        while(answer != -1)
        {
            System.out.println("Please enter numbers. Enter -1 to quit:");
            answer = input.nextInt();

            if(answer != -1)
                nums.add(answer);
        }

        System.out.println(minimum(nums));
    }

    public static int minimum(ArrayList<Integer> arr)
    {
        int arrSize = arr.size();
        int arrSizeMin = arr.size()-1;

        // BASE CASE
        if(arrSize == 1)
            return arr.get(0);

        if(arr.get(arrSizeMin) > arr.get(arrSizeMin-1))
            arr.remove(arrSizeMin);
        else
            arr.remove(arrSizeMin-1);

        return minimum(arr);
    }

}
