import java.util.Scanner;

public class Ex47
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        String name = askName(reader);

        System.out.println("Number of character: " + calculateCharacters(name));
    }

    public static String askName(Scanner r)
    {
        System.out.print("Type your name: ");
        String name = r.nextLine();

        return name;
    }

    public static int calculateCharacters(String s)
    {
        return s.length();
    }
}