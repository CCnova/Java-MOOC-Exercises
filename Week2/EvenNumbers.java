

public class EvenNumbers
{
    public static void main(String[] args)
    {
        int n = 100;

        while(n >= 2)
        {
            if(n%2==0) {System.out.println(n);}

            n -= 2;
        }
    }
}