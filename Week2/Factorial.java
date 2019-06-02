import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int userNumber, fact = 1;

        System.out.print("Type a number: ");
        userNumber = Integer.parseInt(reader.nextLine());

        while(userNumber > 1)
        {
            fact *= userNumber;
            userNumber--;
        }

        System.out.println("Factorial is: " + fact);
    }
}