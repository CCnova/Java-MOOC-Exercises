import java.util.Scanner;

public class Ex48
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        String name = askName(reader);

        System.out.println("First character: " + firstCharacter(name));
    }

    public static String askName(Scanner r)
    {
        System.out.print("Type your name: ");
        String name = r.nextLine();

        return name;
    }

    public static char firstCharacter(String s)
    {
        return s.charAt(0);
    }
}