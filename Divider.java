import java.util.Scanner;

public class Divider
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());

        double division = (double) n1/n2;

        System.out.println("Division: " + n1 + " / " + n2 + " = " + division);
    }
}
