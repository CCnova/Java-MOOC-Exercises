import java.util.Scanner;
import java.util.ArrayList;

public class Ex58
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        String word = " ";

        System.out.print("Type a word: ");
        word = reader.nextLine();

        while(!words.contains(word))
        {
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
        }

        System.out.println("You gave the word " + word + " twice");
    }
}