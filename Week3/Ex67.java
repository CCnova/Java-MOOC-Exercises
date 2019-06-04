import java.util.ArrayList;

public class Ex67
{
    public static int sum(ArrayList<Integer> A)
    {
        int sum = 0;
        for(int n : A) {sum += n;}

        return sum;
    }

    public static double average(ArrayList<Integer> A)
    {
        double average = (double)sum(A)/A.size();

        return average;
    }

    public static double variance(ArrayList<Integer> A)
    {
        double variance = 0; 
        double average = average(A);

        for(int n: A)
        {
            variance += (n - average)*(n - average);
        }

        variance = variance/(A.size() - 1);
        return variance;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}