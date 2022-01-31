import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String inWord = "hangman";
        char[] word = new char[inWord.length()];
        char[] answer = new char[inWord.length()];
        for(int i = 0; i < inWord.length(); i++)
        {
            word[i] = inWord.charAt(i);
            answer[i] = '-';
        }
        Scanner sc = new Scanner(System.in);
        int difficulty = sc.nextInt();
        mainGame(word, answer, difficulty);
    }
    static void mainGame(char[] word, char[] answer, int difficulty)
    {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            char guess = sc.nextLine().charAt(0);
            for(int i = 0; i < word.length; i++)
            {
                if(guess == word[i])
                {
                    answer[i] = guess;
                }
                else
                {
                    difficulty--;
                }
            }
            System.out.println(answer);
        }
    }
}
