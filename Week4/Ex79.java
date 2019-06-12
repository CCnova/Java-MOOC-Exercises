import java.util.Scanner;

public class Ex79
{
    public static void main(String[] args)
    {
        NumberStatistics statsAll = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();
        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: \n");
        int number = Integer.parseInt(reader.nextLine());
        
        while(number != -1)
        {
            statsAll.addNumber(number);
            if(number%2 == 0) {statsEven.addNumber(number);}
            else {statsOdd.addNumber(number);}
            number = Integer.parseInt(reader.nextLine());
        }

        System.out.println("sum: " + statsAll.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum of odd: " + statsOdd.sum());
    }
}