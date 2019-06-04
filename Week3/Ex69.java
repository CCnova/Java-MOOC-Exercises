import java.util.Scanner;
import java.util.ArrayList;

public class Ex69
{
    public static String reverse(String s)
    {
        String sReverse = "";
        for(int i = s.length() - 1; i>=0; i--) {sReverse += s.charAt(i);}

        return sReverse;
    }

    public static boolean palindrome(String s)
    {
        String sReverse = reverse(s);
        if(s.equals(sReverse)) {return true;}
        else {return false;}
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text: ");
        String text = reader.nextLine();

        if(palindrome(text)) {System.out.println("The text is a palindrome!");}

        else {System.out.println("The text is not a palindrome!");}
    }
}