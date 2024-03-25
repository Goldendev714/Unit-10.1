public class Bacteria
{

    public static void main(String[] args)
    {


        System.out.println(colonySize(12));
    }

    public static int colonySize(int hours)
    {
        if(hours == 0)
            return 7;



        return (colonySize(hours - 1) * 4) + colonySize(hours - 1);
    }
}
