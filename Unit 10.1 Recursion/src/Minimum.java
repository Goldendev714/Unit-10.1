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
        // BASE CASE
        if(arr.size() - 1 == 0)
            return arr.get(0);

        if(arr.get(arr.size()-1) > arr.get(arr.size()-2))
            arr.remove(arr.size()-1);
        else
            arr.remove(arr.size()-2);



        return minimum(arr);
    }

}
