import java.util.Scanner;

public class Ex49
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        String name = askName(reader);

        System.out.println("Last character: " + lastCharacter(name));
    }

    public static String askName(Scanner r)
    {
        System.out.print("Type your name: ");
        String name = r.nextLine();

        return name;
    }

    public static char lastCharacter(String s)
    {
        return s.charAt(s.length() - 1);
    }
}