

public class Ex46
{
    public static void main(String[] args)
    {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }

    public static int sum(int n1, int n2, int n3, int n4)
    {
        int result = n1 + n2 + n3 + n4;

        return result;
    }

    public static double average(int n1, int n2, int n3, int n4)
    {
        int sum = sum(n1, n2, n3, n4);

        double result = sum/4.0;
        
        return result;
    }
}