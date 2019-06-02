import java.util.Scanner;

public class LargerProgram
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int userNumber, sum = 0, qtNum = 0, even = 0, odd;
        double average;

        System.out.println("Type numbers:");
        userNumber = Integer.parseInt(reader.nextLine());

        while(userNumber != -1)
        {
            qtNum++;
            if(userNumber%2 == 0) {even++;}
            sum += userNumber;
            userNumber = Integer.parseInt(reader.nextLine());
        }

        average = (double) sum/qtNum;
        odd = qtNum - even;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + qtNum);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}