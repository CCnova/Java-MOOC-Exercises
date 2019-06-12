import java.util.Random;

public class PasswordRandomizer
{
    private Random random;
    private int passwordLength;

    public PasswordRandomizer(int length)
    {
        this.passwordLength = length;
        random = new Random();
    }

    public String createPassword()
    {
        int i = 0, index;
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        char symbol;
        String password = "";

        while (i < this.passwordLength)
        {
            index = random.nextInt(this.passwordLength);
            symbol = symbols.charAt(index);
            password += symbol;
            i++;
        }

        return password;
    }
}