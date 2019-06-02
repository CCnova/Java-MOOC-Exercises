

public class PrintLBoss
{
    public static void main(String[] args)
    {
        xmasTree(10);
    }

    private static void printWhitespaces(int size)
    {
        while(size > 0)
        {
            System.out.print(" ");
            size--;
        }
    }

    private static void printStars(int size)
    {
        while(size > 0)
        {
            System.out.print("*");
            size--;
        }
        System.out.print("\n");
    }

    private static void printTriangle(int size)
    {
        int stars = 1;
        while(size > 0)
        {
            printWhitespaces(size - 1);
            printStars(stars);
            size--;
            stars++;
        }
    }

    private static void xmasTree(int height)
    {
        int stars = 1, whiteSpaces = ((height*2 - 1) - stars)/2;
        while(stars < height*2)
        {
            printWhitespaces(whiteSpaces);
            printStars(stars);
            stars += 2;
            whiteSpaces =  ((height*2 - 1) - stars)/2;
       }

       stars = 3;
       whiteSpaces = ((height*2 - 1) - stars)/2;

        printWhitespaces(whiteSpaces);
        printStars(3);

        printWhitespaces(whiteSpaces);
        printStars(3);
    }
}