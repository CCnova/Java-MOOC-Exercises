import java.util.ArrayList;

public class Ex71
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        list1.add(2);
        list1.add(3);

        list2.add(2);
        list2.add(3);
        list2.add(5);

        smartCombine(list1, list2);

        System.out.println(list1);
        System.out.println(list2);
    }

    public static void smartCombine(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        for(int i : b)
        {
            if(a.contains(i)) {a.add(i);}
        }
    }
}