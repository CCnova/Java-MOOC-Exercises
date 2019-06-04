import java.util.ArrayList;

public class Ex64
{
    public static int sum(ArrayList<Integer> A)
    {
        int sum = 0;
        for(int n : A)
        {
            sum += n;
        }

        return sum;
    }

    public static double average(ArrayList<Integer> A)
    {
        double average = (double)sum(A)/A.size();

        return average;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}