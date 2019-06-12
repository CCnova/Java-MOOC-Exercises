import java.util.Random;
import java.util.ArrayList;

public class LotteryNumbers
{
    private ArrayList<Integer> numbers;
    Random random;

    public LotteryNumbers()
    {
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers()
    {
        return this.numbers;
    }

    public void drawNumbers()
    {   
        this.random = new Random();
        int i = 0;
        while(i < 7)
        {
            int numberDraw = this.random.nextInt(40);
            while(this.containsNumber(numberDraw) || numberDraw == 0)
            {
                numberDraw = this.random.nextInt(40);
            }

            this.numbers.add(numberDraw);
            i++;
        }
    }

    public boolean containsNumber(int number)
    {
        return this.numbers.contains(number);
    }
}