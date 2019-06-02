import java.util.Scanner;

public class ToNumber
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int number, prtN = 1;

        System.out.print("Up to what number? ");
        number = Integer.parseInt(reader.nextLine());

        while(prtN <= number)
        {
            System.out.println(prtN);
            prtN++;
        }
    }
}