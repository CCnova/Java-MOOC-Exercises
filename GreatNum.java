import java.util.Scanner;

public class GreatNum
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int n1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int n2 = Integer.parseInt(reader.nextLine());

        if(n1 == n2)
        {
            System.out.println("The numbers are equal!");
        } else {
            int max = Math.max(n1, n2);
            System.out.println("Greater number: " + max);
        }
    }
}