public class HangmanLogic
{
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word)
    {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults()
    {
        return this.numberOfFaults;
    }

    public String guessedLetters()
    {
        return this.guessedLetters;
    }

    public int losingFaultAmount()
    {
        return 12;
    }

    public void guessLetter(String letter)
    {
        if(this.guessedLetters.contains(letter)) {return;}

        if(!this.word.contains(letter))
        {
            this.numberOfFaults++;
        }

        this.guessedLetters += letter;
    }

    public String hiddenWord()
    {
        String hiddenForm = "";
        char c;
        int i = 0;
        while(i < this.word.length())
        {
            c = this.word.charAt(i);
            String aux = "" + c;
            if(!this.guessedLetters.contains(aux))
            {
                hiddenForm += "_";
            }

            else {hiddenForm += aux;}

            i++;
        }

        return hiddenForm;
    }
}