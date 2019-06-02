import java.util.Scanner;

public class Printing
{
    public static void main(String[] args)
    {
        printTriangle(4);
    }

    private static void printStars(int amount)
    {
        while(amount > 0)
        {
            System.out.print("*");
            amount--;
        }

        System.out.print("\n");
    }

    private static void printSquare(int sideSize)
    {
        int rows = 0;

        while(rows < sideSize)
        {
            printStars(sideSize);
            rows++;
        }
    }

    private static void printRectangle(int width, int height)
    {
        while(height > 0)
        {
            printStars(width);
            height--;
        }
    }

    private static void printTriangle(int size)
    {
        int columns = 1;
        while(size > 0)
        {
            printStars(columns);
            size--;
            columns++;
        }
    }
}