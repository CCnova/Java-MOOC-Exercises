import java.util.ArrayList;

public class Ex66
{
    public static int greatest(ArrayList<Integer> A)
    {
        int greatest = A.get(0);

        for(int n : A)
        {
            if(n > greatest) {greatest = n;}
        }

        return greatest;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}