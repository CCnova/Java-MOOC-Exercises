import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        String password = "carrot";

        while(true)
        {
            System.out.print("Type the password: ");
            String passwordGiven = reader.nextLine();

            if(passwordGiven.equals(password)) 
            {
                System.out.println("Right!");

                System.out.println("The secret is: jryy qbar!");
                break;
            }

            else
            {
                System.out.println("Wrong!");
            }
        }
    }
}