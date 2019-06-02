import java.util.Scanner;

public class SumOfSet
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int upperLimit, n = 1, sum = 0;

        System.out.print("Until what? ");
        upperLimit = Integer.parseInt(reader.nextLine());

        while(n <= upperLimit)
        {
            sum += n;
            n++;
        }

        System.out.println("Sum is " + sum);
    }
}