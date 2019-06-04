import java.util.Scanner;

public class Ex52
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        String name = askName(reader);

        System.out.print("In reverse order: ");
        for(int i = name.length() - 1; i >= 0; i--)
        {
            System.out.print(name.charAt(i));
        }

        System.out.print("\n");
    }

    public static String askName(Scanner r)
    {
        System.out.print("Type your name: ");
        String name = r.nextLine();

        return name;
    }
}