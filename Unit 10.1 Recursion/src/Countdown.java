public class Countdown
{
    public static void main(String[] args)
    {
        System.out.println(countdown(7));
        System.out.println(countdown(10));
    }

    private static String countdown(int num)
    {
        // BASE CASE
        if(num == 1 || num == 2)
            return " Blastoff!";


        return " " + num + (countdown(num - 2));
    }
}
