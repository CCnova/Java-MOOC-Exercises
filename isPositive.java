import java.util.Scanner;

public class isPositive
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());

        if(n1 > 0)
        {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}