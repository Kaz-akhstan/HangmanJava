import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String inWord = "hangman";
        char[] word = new char[inWord.length()];
        for(int i = 0; i < inWord.length(); i++)
        {
            word[i] = inWord.charAt(i);
        }
        Scanner sc = new Scanner(System.in);
        int difficulty = sc.nextInt();

        mainGame(word, difficulty);
    }
    static void mainGame(char[] word, int difficulty)
    {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            char guess = sc.nextLine().charAt(0);
            for(int i = 0; i < word.length; i++)
            {
                if(guess == word[i])
                {
                    
                }
            }
        }
    }
}
