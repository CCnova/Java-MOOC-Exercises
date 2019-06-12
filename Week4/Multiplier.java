public class Multiplier
{
    private int number;

    public Multiplier(int n)
    {
        this.number = n;
    }

    public int multiply(int otherNumber)
    {
        return otherNumber*this.number;
    }
}