import java.util.Scanner;

public class Ex53
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the first part: ");
        int len = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + word.substring(0, len));
    }
}