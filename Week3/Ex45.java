

public class Ex45
{
    public static void main(String[] args)
    {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

    private static int greatest(int n1, int n2, int n3)
    {
        if(n1 >= n2)
        {
            if(n1 >= n3) {return n1;}
            else {return n3;}
        }

        else if(n2 >= n1)
        {
            if(n2 >= n3) {return n2;}
            else {return n3;}
        }

        else {return n3;}
    }
}