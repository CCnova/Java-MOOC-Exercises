

public class Ex44
{
    public static void main(String[] args)
    {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }

    private static int least(int n1, int n2)
    {
        if(n1 <= n2) {return n1;}

        else {return n2;}
    }
}