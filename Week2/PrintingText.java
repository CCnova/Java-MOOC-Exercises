import java.util.Scanner;

public class PrintingText
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int numberTimes;

        System.out.println("How many?");
        numberTimes = Integer.parseInt(reader.nextLine());

        while(numberTimes > 0)
        {
            printText();
            numberTimes--;
        }
    }

    public static void printText()
    {
        System.out.println("In the beginning there were the swamp, the hoe and java.");
    }
}