import java.util.Scanner;

public class SumBetween
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int lowerBound, upperBound, sum = 0;

        System.out.print("First: ");
        lowerBound = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        upperBound = Integer.parseInt(reader.nextLine());

        while(lowerBound <= upperBound)
        {
            sum += lowerBound;
            lowerBound++;
        }

        System.out.println("The sum is " + sum);
    }
}