

public class Ex83
{
    public static void main(String[] args)
    {
        HangmanLogic l = new HangmanLogic("kissa");
        System.out.println("guessing: A, D, S, F, D");
        l.guessLetter("A");
        l.guessLetter("D");
        l.guessLetter("S");
        l.guessLetter("F");
        l.guessLetter("D");
        System.out.println("guessed letters: " + l.guessedLetters());
        System.out.println("number of faults: " + l.numberOfFaults());

        System.out.println("word now: " + l.hiddenWord());
    }
}