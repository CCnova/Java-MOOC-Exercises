import java.util.Scanner;

public class SumPowers
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int sumPowers = 0, userNumber;

        System.out.print("Type a number: ");
        userNumber = Integer.parseInt(reader.nextLine());

        while(userNumber >= 0)
        {
            sumPowers += (int)Math.pow(2, userNumber);
            userNumber--;
        }

        System.out.println("The result is " + sumPowers);
    }
}