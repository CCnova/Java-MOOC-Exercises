import java.util.Scanner;

public class Ex56
{
    public static String reverse(String s)
    {  
        String sReverse = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            sReverse += s.charAt(i);
        }

        return sReverse;
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}