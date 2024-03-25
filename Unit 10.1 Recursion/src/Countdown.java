import java.util.Scanner;

public class Countdown
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to blastoff to!");
        int userNum = input.nextInt();

        System.out.println(countdown(userNum));
    }

    private static String countdown(int num)
    {
        // BASE CASE
        if(num < 1)
            return " Blastoff!";


        return " " + num + (countdown(num - 2));
    }
}
