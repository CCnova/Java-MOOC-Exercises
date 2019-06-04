import java.util.ArrayList;

public class Ex61
{
    public static int countItems(ArrayList<String> A)
    {
        return A.size();
    }
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();

        words.add("Hallo");
        words.add("Ciao");
        words.add("Hello");
        System.out.println("There are this many items in the list: ");
        System.out.println(countItems(words));
    }
}