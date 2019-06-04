
public class Ex43
{
    public static void main(String[] args)
    {
        int answer = sum(4, 3, 6, 1);
        System.out.println("sum: " + answer);
    }

    private static int sum(int n1, int n2, int n3, int n4)
    {
        int sum = n1 + n2 + n3 + n4;
        return sum;
    }
}