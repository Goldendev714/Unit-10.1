public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }

    private static int factorial(int num)
    {
        // BASE CASE
        if(num == 1)
            return 1;


        return num * (factorial(num - 1));
    }
}
