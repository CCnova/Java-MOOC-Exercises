import java.util.ArrayList;

public class Ex82
{
    public static void main(String[] args)
    {
        LotteryNumbers LotteryNumbers = new LotteryNumbers();
        System.out.println("Created LotteryNumbers");
        ArrayList<Integer> numbers = LotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for(int number : numbers)
        {
            System.out.print(number + " ");
        }

        System.out.println("");
    }
}