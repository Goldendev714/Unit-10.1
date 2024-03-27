public class Bacteria
{

    public static void main(String[] args)
    {
        System.out.println(colonySize(12, 7));
    }

    public static int colonySize(int hours, int startingBacteria)
    {
        int rateOfGrowth = 4;

        if(hours == 0)
            return startingBacteria;

        int size = colonySize(hours-1, startingBacteria);

        return (size * rateOfGrowth) + size;
    }
}
