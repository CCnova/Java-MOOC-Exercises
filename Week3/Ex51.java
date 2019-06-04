import java.util.Scanner;

public class Ex51
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        String name = askName(reader);

        for(int i = 0; i < name.length(); i++)
        {
            System.out.println((i+1) + ". character: " + name.charAt(i));
        }
    }

    public static String askName(Scanner r)
    {
        System.out.print("Type your name: ");
        String name = r.nextLine();

        return name;
    }
}