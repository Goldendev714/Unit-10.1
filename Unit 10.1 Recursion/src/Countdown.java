public class Countdown
{
    public static void main(String[] args)
    {
        System.out.println(countdown(7));
        System.out.println(countdown(10));
    }

    private static String countdown(int num)
    {
        String total = num + " ";
        // BASE CASE
        if(num == 1 || num == 2)
            return total + "Blastoff!";


        return total + (countdown(num - 2));
    }
}
